
var projectName = '汽车服务商城系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '汽车',
	url: './pages/qiche/list.html'
}, 
{
	name: '汽车美容',
	url: './pages/qichemeirong/list.html'
}, 
{
	name: '配件',
	url: './pages/peijian/list.html'
}, 
{
	name: '维修保养',
	url: './pages/weixiubaoyang/list.html'
}, 

{
	name: '公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm0dq3x/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"汽车分类","menuJump":"列表","tableName":"qichefenlei"}],"menu":"汽车分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","购买"],"menu":"汽车","menuJump":"列表","tableName":"qiche"}],"menu":"汽车管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","报表","查看评论","预约"],"menu":"汽车美容","menuJump":"列表","tableName":"qichemeirong"}],"menu":"汽车美容管理"},{"child":[{"buttons":["新增","查看","修改","删除","购买"],"menu":"配件","menuJump":"列表","tableName":"peijian"}],"menu":"配件管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"售后服务","menuJump":"列表","tableName":"shouhoufuwu"}],"menu":"售后服务管理"},{"child":[{"buttons":["新增","查看","修改","删除","预约"],"menu":"维修保养","menuJump":"列表","tableName":"weixiubaoyang"}],"menu":"维修保养管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","支付"],"menu":"购买记录","menuJump":"列表","tableName":"goumaijilu"}],"menu":"购买记录管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","支付"],"menu":"预约记录","menuJump":"列表","tableName":"yuyuejilu"}],"menu":"预约记录管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","购买","申请售后"],"menu":"汽车列表","menuJump":"列表","tableName":"qiche"}],"menu":"汽车模块"},{"child":[{"buttons":["查看","支付","查看评论","预约"],"menu":"汽车美容列表","menuJump":"列表","tableName":"qichemeirong"}],"menu":"汽车美容模块"},{"child":[{"buttons":["查看","购买"],"menu":"配件列表","menuJump":"列表","tableName":"peijian"}],"menu":"配件模块"},{"child":[{"buttons":["查看","预约"],"menu":"维修保养列表","menuJump":"列表","tableName":"weixiubaoyang"}],"menu":"维修保养模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"汽车分类","menuJump":"列表","tableName":"qichefenlei"}],"menu":"汽车分类管理"},{"child":[{"buttons":["查看","查看评论","购买","申请售后"],"menu":"汽车","menuJump":"列表","tableName":"qiche"}],"menu":"汽车管理"},{"child":[{"buttons":["查看","查看评论","支付","预约"],"menu":"汽车美容","menuJump":"列表","tableName":"qichemeirong"}],"menu":"汽车美容管理"},{"child":[{"buttons":["查看","购买"],"menu":"配件","menuJump":"列表","tableName":"peijian"}],"menu":"配件管理"},{"child":[{"buttons":["预约","查看"],"menu":"维修保养","menuJump":"列表","tableName":"weixiubaoyang"}],"menu":"维修保养管理"},{"child":[{"buttons":["查看","支付"],"menu":"购买记录","menuJump":"列表","tableName":"goumaijilu"}],"menu":"购买记录管理"},{"child":[{"buttons":["查看","支付"],"menu":"预约记录","menuJump":"列表","tableName":"yuyuejilu"}],"menu":"预约记录管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","购买","申请售后"],"menu":"汽车列表","menuJump":"列表","tableName":"qiche"}],"menu":"汽车模块"},{"child":[{"buttons":["查看","支付","查看评论","预约"],"menu":"汽车美容列表","menuJump":"列表","tableName":"qichemeirong"}],"menu":"汽车美容模块"},{"child":[{"buttons":["查看","购买"],"menu":"配件列表","menuJump":"列表","tableName":"peijian"}],"menu":"配件模块"},{"child":[{"buttons":["查看","预约"],"menu":"维修保养列表","menuJump":"列表","tableName":"weixiubaoyang"}],"menu":"维修保养模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
