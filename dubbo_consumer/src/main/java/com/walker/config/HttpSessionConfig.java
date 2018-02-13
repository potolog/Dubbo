package com.walker.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Author : Walker
 * @Description ：设置redis最大 缓存时间 单位为秒
 * @Date : created in 2017/12/21 11:53
 *
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 24 * 60 * 60)
public class HttpSessionConfig {

	/**
	 * @Author : Walker
	 * @Description ：
	 *              <p>
	 *              其中注解 EnableRedisHttpSession
	 *              创建了一个名为springSessionRepositoryFilter的Spring Bean，
	 *              该Bean实现了Filter接口。 该filter负责通过 Spring Session
	 *              替换HttpSession从哪里返回。这里Spring Session是通过 redis 返回。 类中的方法
	 *              httpSessionStrategy()， 用来定义Spring Session的 HttpSession
	 *              集成使用HTTP的头来取代使用 cookie 传送当前session信息。
	 *              如果使用下面的代码，则是使用cookie来传送 session 信息。
	 * @Date : created in 2017/12/19 15:13
	 *       </p>
	 */
}
