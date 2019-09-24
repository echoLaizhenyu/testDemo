package com.example.demo;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class HelloWorldController {
//	@Autowired
//    private JdbcTemplate jdbcTemplate;
	    @RequestMapping("/hello")
	    @Transactional
	    public String index() throws Exception {
	    	/*String sql = "select * from test";
	        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
	        String sql2 = "insert into test(name) values('2')";
	        jdbcTemplate.execute(sql2);
	        String sql3 = "insert into test(name) values('2')";
	        jdbcTemplate.execute(sql3);*/
	        return "Hello World";
	    }
	    @RequestMapping("/ssq")
	    @Transactional
	    public String ssq() throws Exception {
	    	
	    	return pai.getdoubleball();
	    }
	    @RequestMapping("/dlt")
	    @Transactional
	    public String dlt() throws Exception {
	    	
	    	return pai.gethappyball();
	    }
	    @RequestMapping("/qxc")
	    @Transactional
	    public String qxc() throws Exception {
	    	
	    	return pai.getQiXingCai();
	    }
	    @RequestMapping("/sg")
	    @Transactional
	    public String sg() throws Exception {
	    	return pai.setString();
	    }
	} 
