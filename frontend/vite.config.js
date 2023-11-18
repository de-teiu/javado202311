import { defineConfig } from 'vite';
import { resolve } from "path";

export default defineConfig({
  root: "src",
  base: "/",
  build: {
    outDir: '../../src/main/resources/static',
    emptyOutDir: true,
    rollupOptions: {
      input: {
        index: resolve(__dirname, './src/index.html'),
        portal: resolve(__dirname, './src/portal.html')
      }
    }
  },
});