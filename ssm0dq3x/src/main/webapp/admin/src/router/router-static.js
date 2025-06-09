import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qichemeirong from '@/views/modules/qichemeirong/list'
    import qiche from '@/views/modules/qiche/list'
    import qichefenlei from '@/views/modules/qichefenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import goumaijilu from '@/views/modules/goumaijilu/list'
    import weixiubaoyang from '@/views/modules/weixiubaoyang/list'
    import yuyuejilu from '@/views/modules/yuyuejilu/list'
    import shouhoufuwu from '@/views/modules/shouhoufuwu/list'
    import discussqiche from '@/views/modules/discussqiche/list'
    import peijian from '@/views/modules/peijian/list'
    import discussqichemeirong from '@/views/modules/discussqichemeirong/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/qichemeirong',
        name: '汽车美容',
        component: qichemeirong
      }
      ,{
	path: '/qiche',
        name: '汽车',
        component: qiche
      }
      ,{
	path: '/qichefenlei',
        name: '汽车分类',
        component: qichefenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/goumaijilu',
        name: '购买记录',
        component: goumaijilu
      }
      ,{
	path: '/weixiubaoyang',
        name: '维修保养',
        component: weixiubaoyang
      }
      ,{
	path: '/yuyuejilu',
        name: '预约记录',
        component: yuyuejilu
      }
      ,{
	path: '/shouhoufuwu',
        name: '售后服务',
        component: shouhoufuwu
      }
      ,{
	path: '/discussqiche',
        name: '汽车评论',
        component: discussqiche
      }
      ,{
	path: '/peijian',
        name: '配件',
        component: peijian
      }
      ,{
	path: '/discussqichemeirong',
        name: '汽车美容评论',
        component: discussqichemeirong
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
