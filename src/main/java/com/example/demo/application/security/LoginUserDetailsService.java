package com.example.demo.application.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.mapper.UserMasterMapper;
import com.example.demo.domain.model.UserMaster;
import com.example.demo.domain.model.UserMasterExample;

@Service
public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	private UserMasterMapper userMasterMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserMasterExample condition = new UserMasterExample();
		condition.createCriteria().andMailEqualTo(username);
		List<UserMaster> users = userMasterMapper.selectByExample(condition);

		if (users.isEmpty()) {
			throw new UsernameNotFoundException("not found");
		}
		UserMaster user = users.get(0);
		List<String> roles = Arrays.asList("ROLE_USER");
		LoginUser loginUser = new LoginUser(user.getId(), user.getMail(), user.getMail(), user.getPassword(), roles);
		return new LoginUserDetails(loginUser);

	}
}