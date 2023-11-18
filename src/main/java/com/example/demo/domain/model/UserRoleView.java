package com.example.demo.domain.model;

/**
 * Database Table Remarks:
 *   ユーザー権限ビュー
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table public.user_role_view
 */
public class UserRoleView {
    /**
     * Database Column Remarks:
     *   user_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_role_view.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   role_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_role_view.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     * Database Column Remarks:
     *   role_name
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user_role_view.role_name
     *
     * @mbg.generated
     */
    private String roleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_role_view.user_id
     *
     * @return the value of public.user_role_view.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_role_view.user_id
     *
     * @param userId the value for public.user_role_view.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_role_view.role_id
     *
     * @return the value of public.user_role_view.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_role_view.role_id
     *
     * @param roleId the value for public.user_role_view.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user_role_view.role_name
     *
     * @return the value of public.user_role_view.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user_role_view.role_name
     *
     * @param roleName the value for public.user_role_view.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}