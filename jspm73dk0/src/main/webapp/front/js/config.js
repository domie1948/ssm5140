
var projectName = '停车场管理系统';
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
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '车位信息',
	url: './pages/cheweixinxi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm73dk0/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车位信息","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"ic卡信息","menuJump":"列表","tableName":"ickaxinxi"}],"menu":"ic卡信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"临时车主停车","menuJump":"列表","tableName":"linshichezhutingche"}],"menu":"临时车主停车管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"临时车主出场","menuJump":"列表","tableName":"linshichezhuchuchang"}],"menu":"临时车主出场管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"固定车主停车","menuJump":"列表","tableName":"gudingchezhutingche"}],"menu":"固定车主停车管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"固定车主出场","menuJump":"列表","tableName":"gudingchezhuchuchang"}],"menu":"固定车主出场管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","ic卡领取"],"menu":"车位信息列表","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["入场停车","固定车主入场","临时车主入场"],"menu":"车位信息","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息管理"},{"child":[{"buttons":["查看","临时车主入场","固定车主入场"],"menu":"ic卡信息","menuJump":"列表","tableName":"ickaxinxi"}],"menu":"ic卡信息管理"},{"child":[{"buttons":["查看","费用缴纳","停车出场"],"menu":"临时车主停车","menuJump":"列表","tableName":"linshichezhutingche"}],"menu":"临时车主停车管理"},{"child":[{"buttons":["查看","支付"],"menu":"临时车主出场","menuJump":"列表","tableName":"linshichezhuchuchang"}],"menu":"临时车主出场管理"},{"child":[{"buttons":["查看","停车出场"],"menu":"固定车主停车","menuJump":"列表","tableName":"gudingchezhutingche"}],"menu":"固定车主停车管理"},{"child":[{"buttons":["查看"],"menu":"固定车主出场","menuJump":"列表","tableName":"gudingchezhuchuchang"}],"menu":"固定车主出场管理"}],"frontMenu":[{"child":[{"buttons":["查看","ic卡领取"],"menu":"车位信息列表","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


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
