---
title: 网易云音乐API Part1(登录，用户，歌单)
date: 2017-12-21 16:21:03
tags: [网易云音乐]
---

## 测试相关

用户id=1317458286

用户最爱歌歌单id=2023423393

歌曲id=289145

专辑id=28688

歌单id=381180171

MVid=381180171

电台节目id=908984796

电台评论id=648416766

## 登录

### 手机登陆

[http://116.196.87.226:3000/login/cellphone?phone=15926099436&password=qpb110120](http://116.196.87.226:3000/login/cellphone?phone=15926099436&password=qpb110120)

```
{
    "loginType": 1,
    "code": 200,
    "account": {
        "id": 1317458286,
        "userName": "1_15926099436",
        "type": 1,
        "status": 0,
        "whitelistAuthority": 0,
        "createTime": 1513839036003,
        "salt": "[B@284f9da3",
        "tokenVersion": 0,
        "ban": 0,
        "baoyueVersion": 0,
        "donateVersion": 0,
        "vipType": 0,
        "viptypeVersion": 0,
        "anonimousUser": false
    },
    "profile": {
        "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
        "defaultAvatar": true,
        "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
        "gender": 0,
        "birthday": -2209017600000,
        "city": 210200,
        "userId": 1317458286,
        "vipType": 0,
        "accountStatus": 0,
        "avatarImgId": 18686200114669624,
        "experts": {},
        "nickname": "我任何人都不是",
        "remarkName": null,
        "mutual": false,
        "province": 210000,
        "expertTags": null,
        "authStatus": 0,
        "backgroundImgId": 109951162868128400,
        "userType": 0,
        "description": "",
        "avatarImgIdStr": "18686200114669622",
        "backgroundImgIdStr": "109951162868128395",
        "detailDescription": "",
        "djStatus": 0,
        "followed": false,
        "signature": "",
        "authority": 0,
        "avatarImgId_str": "18686200114669622"
    },
    "bindings": [
        {
            "userId": 1317458286,
            "url": "",
            "tokenJsonStr": "{\"countrycode\":\"\",\"cellphone\":\"15926099436\",\"hasPassword\":true}",
            "expired": false,
            "expiresIn": 2147483647,
            "refreshTime": 1513839036,
            "id": 6508347690,
            "type": 1
        }
    ]
}
```

### 刷新登录

[http://116.196.87.226:3000/login/refresh?uid=1317458286](http://116.196.87.226:3000/login/refresh?uid=1317458286)

```
{
    "code": 200
}
```

## 用户

### 获取用户详情

[http://116.196.87.226:3000/user/detail?uid=1317458286](http://116.196.87.226:3000/user/detail?uid=1317458286)

```
{
    "profile": {
        "avatarImgIdStr": "18686200114669622",
        "backgroundImgIdStr": "109951162868128395",
        "detailDescription": "",
        "djStatus": 0,
        "followed": false,
        "province": 210000,
        "defaultAvatar": true,
        "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
        "gender": 0,
        "birthday": -2209017600000,
        "city": 210200,
        "userId": 1317458286,
        "remarkName": null,
        "mutual": false,
        "nickname": "我任何人都不是",
        "vipType": 0,
        "accountStatus": 0,
        "avatarImgId": 18686200114669624,
        "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
        "description": "",
        "experts": {},
        "expertTags": null,
        "authStatus": 0,
        "backgroundImgId": 109951162868128400,
        "userType": 0,
        "signature": "",
        "authority": 0,
        "avatarImgId_str": "18686200114669622",
        "followeds": 0,
        "follows": 4,
        "blacklist": false,
        "eventCount": 0,
        "playlistCount": 1,
        "playlistBeSubscribedCount": 0
    },
    "level": 0,
    "listenSongs": 0,
    "userPoint": {
        "userId": 1317458286,
        "balance": 0,
        "updateTime": 1513839151108,
        "version": 0,
        "status": 0,
        "blockBalance": 0
    },
    "mobileSign": false,
    "pcSign": false,
    "peopleCanSeeMyPlayRecord": true,
    "bindings": [
        {
            "refreshTime": 1513839036,
            "expiresIn": 2147483647,
            "userId": 1317458286,
            "tokenJsonStr": "{\"countrycode\":\"\",\"cellphone\":\"15926099436\",\"hasPassword\":true}",
            "url": "",
            "expired": false,
            "id": 6508347690,
            "type": 1
        }
    ],
    "adValid": true,
    "code": 200,
    "createTime": 1513839036003,
    "createDays": 1
}
```

### 获取用户信息,歌单，收藏，mv, dj 数量

[http://116.196.87.226:3000/user/subcount?uid=1317458286](http://116.196.87.226:3000/user/subcount?uid=1317458286)

```
{
    "programCount": 0,
    "djRadioCount": 1,
    "mvCount": 0,
    "artistCount": 1,
    "newProgramCount": 0,
    "createDjRadioCount": 0,
    "createdPlaylistCount": 2,
    "subPlaylistCount": 0,
    "code": 200
}
```

### 获取用户歌单

[http://116.196.87.226:3000/user/playlist?uid=1317458286](http://116.196.87.226:3000/user/playlist?uid=1317458286)

```
{
    "more": false,
    "playlist": [
        {
            "subscribers": [],
            "subscribed": false,
            "creator": {
                "defaultAvatar": true,
                "province": 210000,
                "authStatus": 0,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "accountStatus": 0,
                "gender": 0,
                "city": 210200,
                "birthday": -2209017600000,
                "userId": 1317458286,
                "userType": 0,
                "nickname": "我任何人都不是",
                "signature": "",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 18686200114669624,
                "backgroundImgId": 109951162868128400,
                "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": null,
                "experts": null,
                "djStatus": 0,
                "vipType": 0,
                "remarkName": null,
                "avatarImgIdStr": "18686200114669622",
                "backgroundImgIdStr": "109951162868128395",
                "avatarImgId_str": "18686200114669622"
            },
            "artists": null,
            "tracks": null,
            "ordered": false,
            "tags": [],
            "adType": 0,
            "trackNumberUpdateTime": 1513839634576,
            "subscribedCount": 0,
            "cloudTrackCount": 1,
            "description": null,
            "status": 0,
            "userId": 1317458286,
            "privacy": 0,
            "newImported": false,
            "trackCount": 2,
            "playCount": 0,
            "coverImgUrl": "http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg",
            "trackUpdateTime": 1513839634576,
            "coverImgId": 3422779698817209,
            "createTime": 1513839151074,
            "updateTime": 1513839634576,
            "specialType": 5,
            "anonimous": false,
            "commentThreadId": "A_PL_0_2023423393",
            "totalDuration": 0,
            "highQuality": false,
            "name": "我任何人都不是喜欢的音乐",
            "id": 2023423393
        },
        {
            "subscribers": [],
            "subscribed": false,
            "creator": {
                "defaultAvatar": true,
                "province": 210000,
                "authStatus": 0,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "accountStatus": 0,
                "gender": 0,
                "city": 210200,
                "birthday": -2209017600000,
                "userId": 1317458286,
                "userType": 0,
                "nickname": "我任何人都不是",
                "signature": "",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 18686200114669624,
                "backgroundImgId": 109951162868128400,
                "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": null,
                "experts": null,
                "djStatus": 0,
                "vipType": 0,
                "remarkName": null,
                "avatarImgIdStr": "18686200114669622",
                "backgroundImgIdStr": "109951162868128395",
                "avatarImgId_str": "18686200114669622"
            },
            "artists": null,
            "tracks": null,
            "ordered": false,
            "tags": [],
            "adType": 0,
            "trackNumberUpdateTime": 1513839587071,
            "subscribedCount": 0,
            "cloudTrackCount": 0,
            "description": null,
            "status": 0,
            "userId": 1317458286,
            "privacy": 0,
            "newImported": false,
            "trackCount": 1,
            "playCount": 0,
            "coverImgUrl": "http://p1.music.126.net/EOJK7dx4E9CkYxgrdSuuLw==/17756013277390221.jpg",
            "trackUpdateTime": 1513839587135,
            "coverImgId": 17756013277390220,
            "createTime": 1513839543318,
            "updateTime": 1513839587071,
            "specialType": 0,
            "anonimous": false,
            "commentThreadId": "A_PL_0_2023422484",
            "totalDuration": 0,
            "highQuality": false,
            "name": "歌单",
            "id": 2023422484,
            "coverImgId_str": "17756013277390221"
        }
    ],
    "code": 200
}
```

### 获取用户电台

**好像有点问题，不该没有数据**

[http://116.196.87.226:3000/user/dj?uid=1317458286](http://116.196.87.226:3000/user/dj?uid=1317458286)

```
{
    "code": 200,
    "count": 0,
    "programs": [],
    "more": false
}
```

### 获取用户关注列表

[http://116.196.87.226:3000/user/follows?uid=1317458286&limit=2&offset=0](http://116.196.87.226:3000/user/follows?uid=1317458286&limit=2&offset=0)

可选参数:

limit : 返回数量,默认为30

offset : 偏移数量，用于分页,如: 如:(页数-1)x30, 其中 30 为 limit 的值,默认为0

```
{
    "follow": [
        {
            "py": "wyxw",
            "time": 0,
            "userId": 1316351656,
            "followed": false,
            "experts": null,
            "followeds": 31067,
            "userType": 3,
            "expertTags": null,
            "authStatus": 1,
            "follows": 8,
            "mutual": false,
            "gender": 1,
            "avatarUrl": "http://p1.music.126.net/yRELewNVfQnmTnoNiNRvUw==/18730180581314249.jpg",
            "vipType": 0,
            "accountStatus": 0,
            "nickname": "网易新闻",
            "remarkName": null,
            "signature": "我们为你提供丰富的资讯，也包容你天马行空的想法，愿与每个年轻态度一起逆生长，相遇、相知、相伴，各凭态度乘风浪。未知的世界，在新鲜有趣的短视频里，在海量的新闻事实里，在犀利的跟贴里，在独到的原创里，在最热的直播里，在“网易号”的自媒体平台里，和网易新闻一起去探索未知的世界吧！",
            "blacklist": false,
            "eventCount": 5,
            "playlistCount": 1
        },
        {
            "py": "wyUFOdl",
            "time": 0,
            "userId": 48353,
            "followed": false,
            "experts": null,
            "followeds": 99999,
            "userType": 0,
            "expertTags": null,
            "authStatus": 1,
            "follows": 64,
            "mutual": false,
            "gender": 1,
            "avatarUrl": "http://p1.music.126.net/93GM3dF-epgkpmn7xdjseQ==/109951162797195316.jpg",
            "vipType": 11,
            "accountStatus": 0,
            "nickname": "网易UFO丁磊",
            "remarkName": null,
            "signature": "做音乐是为了灵魂的对话与沟通〜",
            "blacklist": false,
            "eventCount": 826,
            "playlistCount": 28
        },
        {
            "py": "yylxms",
            "time": 0,
            "userId": 9003,
            "followed": true,
            "experts": null,
            "followeds": 99999,
            "userType": 0,
            "expertTags": null,
            "authStatus": 1,
            "follows": 396,
            "mutual": false,
            "gender": 0,
            "avatarUrl": "http://p1.music.126.net/3izpdkVvIPM0s3YZ2pnlaw==/109951163068642813.jpg",
            "vipType": 11,
            "accountStatus": 0,
            "nickname": "云音乐小秘书",
            "remarkName": null,
            "signature": "欢迎使用网易云音乐！独立音乐人和独立厂牌相关问题请私信@原创君 ，电台主播相关问题请联系@潇洒小编，如您需要其他帮助请私信@云音乐客服 解决。",
            "blacklist": false,
            "eventCount": 4359,
            "playlistCount": 62
        },
        {
            "py": "wyyyl",
            "time": 0,
            "userId": 1,
            "followed": true,
            "experts": null,
            "followeds": 99999,
            "userType": 2,
            "expertTags": null,
            "authStatus": 1,
            "follows": 383,
            "mutual": false,
            "gender": 1,
            "avatarUrl": "http://p1.music.126.net/QWMV-Ru_6149AKe0mCBXKg==/1420569024374784.jpg",
            "vipType": 11,
            "accountStatus": 0,
            "nickname": "网易云音乐",
            "remarkName": null,
            "signature": "欢迎使用网易云音乐，有任何问题可以联系@云音乐客服， 我们会尽快答复。有关独立音乐人和独立厂牌请站内私信@原创君，DJ入驻联系邮箱： yunmusic@163.com",
            "blacklist": false,
            "eventCount": 8818,
            "playlistCount": 126
        }
    ],
    "touchCount": 0,
    "more": false,
    "code": 200
}
```

### 获取用户粉丝列表

[http://116.196.87.226:3000/user/followeds?uid=1317458286&limit=2&offset=0](http://116.196.87.226:3000/user/followeds?uid=1317458286&limit=2&offset=0)

```
{
    "code": 200,
    "more": false,
    "followeds": [
        {
            "py": "cgctgctgctg",
            "time": 1513840834854,
            "userId": 1315274973,
            "vipType": 0,
            "accountStatus": 0,
            "nickname": "cgctgctgctg",
            "follows": 5,
            "mutual": false,
            "remarkName": null,
            "avatarUrl": "http://p1.music.126.net/Za0nWZTmwTw2Eb7X6A8eRQ==/19237055440070821.jpg",
            "gender": 2,
            "userType": 0,
            "experts": null,
            "followeds": 0,
            "expertTags": null,
            "authStatus": 0,
            "followed": false,
            "signature": null,
            "eventCount": 0,
            "playlistCount": 1
        }
    ]
}
```

### 获取用户动态

[http://116.196.87.226:3000/user/event?uid=1317458286](http://116.196.87.226:3000/user/event?uid=1317458286)

```
{
    "lasttime": 1513840986866,
    "more": false,
    "size": 1,
    "events": [
        {
            "actName": null,
            "forwardCount": 0,
            "eventTime": 1513840986866,
            "json": "{\"msg\":\"好听\",\"song\":{\"name\":\"Midnight City\",\"id\":29228524,\"position\":9,\"alias\":[],\"status\":0,\"fee\":0,\"copyrightId\":0,\"disc\":\"1\",\"no\":9,\"artists\":[{\"name\":\"Philippe Rombi\",\"id\":41252,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0}],\"album\":{\"name\":\"Jeune et jolie\",\"id\":2997937,\"type\":\"专辑\",\"size\":13,\"picId\":3227066627691471,\"blurPicUrl\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg\",\"companyId\":0,\"pic\":3227066627691471,\"picUrl\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg\",\"publishTime\":1376841600000,\"description\":\"\",\"tags\":\"\",\"company\":\"Cristal Records\",\"briefDesc\":\"\",\"artist\":{\"name\":\"\",\"id\":0,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0},\"songs\":[],\"alias\":[\"花容月貌\"],\"status\":0,\"copyrightId\":0,\"commentThreadId\":\"R_AL_3_2997937\",\"artists\":[{\"name\":\"Philippe Rombi\",\"id\":41252,\"picId\":0,\"img1v1Id\":0,\"briefDesc\":\"\",\"picUrl\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"img1v1Url\":\"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg\",\"albumSize\":0,\"alias\":[],\"trans\":\"\",\"musicSize\":0}],\"img80x80\":\"http://p1.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg?param=80x80x1\"},\"starred\":false,\"popularity\":50.0,\"score\":50,\"starredNum\":0,\"duration\":244009,\"playedNum\":0,\"dayPlays\":0,\"hearTime\":0,\"ringtone\":null,\"crbt\":null,\"audition\":null,\"copyFrom\":\"\",\"commentThreadId\":\"R_SO_4_29228524\",\"rtUrl\":null,\"ftype\":0,\"rtUrls\":[],\"copyright\":2,\"hMusic\":{\"name\":\"Midnight City\",\"id\":52263087,\"size\":9763553,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":320000,\"playTime\":244009,\"volumeDelta\":-0.25},\"mMusic\":{\"name\":\"Midnight City\",\"id\":52263088,\"size\":4882313,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":160000,\"playTime\":244009,\"volumeDelta\":0.16},\"lMusic\":{\"name\":\"Midnight City\",\"id\":52263089,\"size\":2929817,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":96000,\"playTime\":244009,\"volumeDelta\":0.07},\"bMusic\":{\"name\":\"Midnight City\",\"id\":52263089,\"size\":2929817,\"extension\":\"mp3\",\"sr\":44100,\"dfsId\":0,\"bitrate\":96000,\"playTime\":244009,\"volumeDelta\":0.07},\"rtype\":0,\"rurl\":null,\"mvid\":5342095,\"mp3Url\":null}}",
            "pics": [],
            "rcmdInfo": null,
            "actId": 0,
            "user": {
                "defaultAvatar": true,
                "province": 210000,
                "authStatus": 0,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "accountStatus": 0,
                "gender": 0,
                "city": 210200,
                "birthday": -2209017600000,
                "userId": 1317458286,
                "userType": 0,
                "nickname": "我任何人都不是",
                "signature": "",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 18686200114669624,
                "backgroundImgId": 109951162868128400,
                "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": null,
                "experts": null,
                "djStatus": 0,
                "vipType": 0,
                "remarkName": null,
                "backgroundImgIdStr": "109951162868128395",
                "avatarImgIdStr": "18686200114669622",
                "urlAnalyze": false,
                "avatarImgId_str": "18686200114669622"
            },
            "expireTime": 0,
            "uuid": null,
            "showTime": 1513840986866,
            "tmplId": 0,
            "id": 2439921639,
            "type": 18,
            "topEvent": false,
            "info": {
                "commentThread": {
                    "id": "A_EV_2_2439921639_1317458286",
                    "resourceInfo": null,
                    "resourceType": 2,
                    "commentCount": 0,
                    "likedCount": 0,
                    "shareCount": 0,
                    "hotCount": 0,
                    "latestLikedUsers": null,
                    "resourceId": 0,
                    "resourceOwnerId": 0,
                    "resourceTitle": null
                },
                "latestLikedUsers": null,
                "liked": false,
                "comments": null,
                "resourceType": 2,
                "resourceId": 2439921639,
                "commentCount": 0,
                "likedCount": 0,
                "shareCount": 0,
                "threadId": "A_EV_2_2439921639_1317458286"
            }
        }
    ],
    "code": 200
}
```

### 获取用户播放记录

[http://116.196.87.226:3000/user/record?uid=1317458286&type=1](http://116.196.87.226:3000/user/record?uid=1317458286&type=1)

可选参数:

type : type=1时只返回weekData, type=0时返回allData

```
{
    "weekData": [
        {
            "playCount": 0,
            "score": 100,
            "song": {
                "rtUrls": [],
                "ar": [
                    {
                        "id": 1135024,
                        "name": "ウォルピスカーター"
                    }
                ],
                "al": {
                    "id": 3271106,
                    "name": "ウォルピスカーター作品集",
                    "picUrl": "http://p4.music.126.net/MP7j7DtHqLWsyH3n3TCylQ==/3351311441816054.jpg",
                    "pic_str": "3351311441816054",
                    "pic": 3351311441816054
                },
                "st": 0,
                "no": 1,
                "djId": 0,
                "cd": "1",
                "a": null,
                "m": {
                    "br": 160000,
                    "fid": 7956066140576293,
                    "size": 4076713,
                    "vd": -4.92
                },
                "ftype": 0,
                "rtype": 0,
                "rurl": null,
                "t": 0,
                "fee": 0,
                "name": "アサガオの散る頃に",
                "id": 34078903,
                "dt": 203781,
                "h": null,
                "l": {
                    "br": 96000,
                    "fid": 7976956861488817,
                    "size": 2446045,
                    "vd": -4.99
                },
                "rtUrl": null,
                "alia": [],
                "pop": 100,
                "rt": null,
                "mst": 9,
                "cp": 0,
                "crbt": null,
                "mv": 0,
                "cf": "",
                "pst": 0,
                "v": 4,
                "privilege": {
                    "id": 34078903,
                    "fee": 0,
                    "payed": 0,
                    "st": 0,
                    "pl": 192000,
                    "dl": 192000,
                    "sp": 7,
                    "cp": 1,
                    "subp": 1,
                    "cs": false,
                    "maxbr": 192000,
                    "fl": 320000,
                    "toast": false,
                    "flag": 0,
                    "preSell": false
                }
            }
        },
        {
            "playCount": 0,
            "score": 100,
            "song": {
                "rtUrls": [],
                "ar": [
                    {
                        "id": 1132492,
                        "name": "DJNolyn"
                    }
                ],
                "al": {
                    "id": 3266245,
                    "name": "小黄人",
                    "picUrl": "http://p3.music.126.net/qNen46sq6Vjo-hNr41Ooyg==/3331520232351422.jpg",
                    "pic_str": "3331520232351422",
                    "pic": 3331520232351422,
                    "alia": [
                        "Minions(Original Mix)"
                    ]
                },
                "st": 0,
                "no": 1,
                "djId": 0,
                "cd": "1",
                "a": null,
                "m": null,
                "ftype": 0,
                "rtype": 0,
                "rurl": null,
                "t": 0,
                "fee": 0,
                "name": "Minions(Original Mix)",
                "id": 33916538,
                "dt": 190458,
                "h": null,
                "l": {
                    "br": 96000,
                    "fid": 8002245628784228,
                    "size": 2286176,
                    "vd": -2.93
                },
                "rtUrl": null,
                "alia": [
                    "小黄人"
                ],
                "pop": 95,
                "rt": null,
                "mst": 9,
                "cp": 0,
                "crbt": null,
                "mv": 0,
                "cf": "",
                "pst": 0,
                "v": 3,
                "privilege": {
                    "id": 33916538,
                    "fee": 0,
                    "payed": 0,
                    "st": 0,
                    "pl": 128000,
                    "dl": 128000,
                    "sp": 7,
                    "cp": 1,
                    "subp": 1,
                    "cs": false,
                    "maxbr": 128000,
                    "fl": 320000,
                    "toast": false,
                    "flag": 0,
                    "preSell": false
                }
            }
        },
        {
            "playCount": 0,
            "score": 100,
            "song": {
                "rtUrls": [],
                "ar": [
                    {
                        "id": 688722,
                        "name": "Manufactured Superstars"
                    }
                ],
                "al": {
                    "id": 3024017,
                    "name": "Need For Speed: Rivals (Original Soundtrack)",
                    "picUrl": "http://p4.music.126.net/hHyzrB6QeXHL3j7t99iToQ==/2544269906892438.jpg",
                    "pic_str": "2544269906892438",
                    "pic": 2544269906892438
                },
                "st": 0,
                "no": 25,
                "djId": 0,
                "cd": "1",
                "a": null,
                "m": {
                    "br": 160000,
                    "fid": 6661940953354342,
                    "size": 6754767,
                    "vd": 1.37892
                },
                "ftype": 0,
                "rtype": 0,
                "rurl": null,
                "t": 0,
                "fee": 0,
                "name": "Angry Panda",
                "id": 29431100,
                "dt": 337632,
                "h": {
                    "br": 320000,
                    "fid": 6670737046358499,
                    "size": 13508464,
                    "vd": 1.2681
                },
                "l": {
                    "br": 96000,
                    "fid": 2543170395266401,
                    "size": 4053287,
                    "vd": 0.256368
                },
                "rtUrl": null,
                "alia": [],
                "pop": 45,
                "rt": null,
                "mst": 9,
                "cp": 0,
                "crbt": null,
                "mv": 0,
                "cf": "",
                "pst": 0,
                "v": 135,
                "privilege": {
                    "id": 29431100,
                    "fee": 0,
                    "payed": 0,
                    "st": 0,
                    "pl": 320000,
                    "dl": 320000,
                    "sp": 7,
                    "cp": 1,
                    "subp": 1,
                    "cs": false,
                    "maxbr": 320000,
                    "fl": 320000,
                    "toast": false,
                    "flag": 0,
                    "preSell": false
                }
            }
        },
        {
            "playCount": 0,
            "score": 100,
            "song": {
                "rtUrls": [],
                "ar": [
                    {
                        "id": 41252,
                        "name": "Philippe Rombi"
                    }
                ],
                "al": {
                    "id": 2997937,
                    "name": "Jeune et jolie",
                    "picUrl": "http://p3.music.126.net/FIm9y-sAQd1gP7DV-7abUg==/3227066627691471.jpg",
                    "pic_str": "3227066627691471",
                    "pic": 3227066627691471,
                    "alia": [
                        "花容月貌"
                    ]
                },
                "st": 0,
                "no": 9,
                "djId": 0,
                "cd": "1",
                "a": null,
                "m": {
                    "br": 160000,
                    "fid": 3238061744113148,
                    "size": 4882313,
                    "vd": 0.16
                },
                "ftype": 0,
                "rtype": 0,
                "rurl": null,
                "t": 0,
                "fee": 0,
                "name": "Midnight City",
                "id": 29228524,
                "dt": 244009,
                "h": {
                    "br": 320000,
                    "fid": 3223768092948400,
                    "size": 9763553,
                    "vd": -0.25
                },
                "l": {
                    "br": 96000,
                    "fid": 3232564185976273,
                    "size": 2929817,
                    "vd": 0.07
                },
                "rtUrl": null,
                "alia": [],
                "pop": 50,
                "rt": null,
                "mst": 9,
                "cp": 0,
                "crbt": null,
                "mv": 5342095,
                "cf": "",
                "pst": 0,
                "v": 3,
                "privilege": {
                    "id": 29228524,
                    "fee": 0,
                    "payed": 0,
                    "st": 0,
                    "pl": 320000,
                    "dl": 320000,
                    "sp": 7,
                    "cp": 1,
                    "subp": 1,
                    "cs": false,
                    "maxbr": 320000,
                    "fl": 320000,
                    "toast": false,
                    "flag": 0,
                    "preSell": false
                }
            }
        },
        {
            "playCount": 0,
            "score": 100,
            "song": {
                "rtUrls": [],
                "ar": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift"
                    }
                ],
                "al": {
                    "id": 201796,
                    "name": "Unreleased Songs [Bootleg]",
                    "picUrl": "http://p4.music.126.net/dqKqSlD7_R9ZP-KinwGdrg==/863116627857110.jpg",
                    "pic_str": "863116627857110",
                    "pic": 863116627857110
                },
                "st": -1,
                "no": 8,
                "djId": 0,
                "cd": "1",
                "a": null,
                "m": {
                    "br": 160000,
                    "fid": 0,
                    "size": 3985809,
                    "vd": 0
                },
                "ftype": 0,
                "rtype": 0,
                "rurl": null,
                "t": 0,
                "fee": 0,
                "name": "I’m Every Woman",
                "id": 2001602,
                "dt": 197302,
                "h": {
                    "br": 320000,
                    "fid": 0,
                    "size": 7925083,
                    "vd": -0.000265076
                },
                "l": {
                    "br": 96000,
                    "fid": 0,
                    "size": 2406968,
                    "vd": -0.000265076
                },
                "rtUrl": null,
                "alia": [],
                "pop": 30,
                "rt": "",
                "mst": 9,
                "cp": 5003,
                "crbt": null,
                "mv": 0,
                "cf": "",
                "pst": 0,
                "v": 32,
                "privilege": {
                    "id": 2001602,
                    "fee": 0,
                    "payed": 0,
                    "st": -200,
                    "pl": 0,
                    "dl": 0,
                    "sp": 0,
                    "cp": 1,
                    "subp": 0,
                    "cs": false,
                    "maxbr": 320000,
                    "fl": 0,
                    "toast": false,
                    "flag": 0,
                    "preSell": false
                }
            }
        }
    ],
    "code": 200
}
```

## 其他

### 获取动态消息

**这个api有毒，先放着吧**

[http://116.196.87.226:3000/event](http://116.196.87.226:3000/event)


## 歌单

### 获取精品歌单

可选参数:

cat: tag, 比如 "华语"、"古风" 、"欧美"、"流行",默认为"全部"

**没有获知全部参数**

limit: 取出歌单数量,默认为20

[http://116.196.87.226:3000/top/playlist/highquality?limit=2&cat=日语](http://116.196.87.226:3000/top/playlist/highquality?limit=2&cat=日语)

```
{
    "playlists": [
        {
            "name": "100位欧美90后歌手：他们把青春给了音乐",
            "id": 733122887,
            "trackNumberUpdateTime": 1513518041820,
            "status": 0,
            "userId": 92582150,
            "createTime": 1495188246916,
            "updateTime": 1513525979919,
            "subscribedCount": 178329,
            "trackCount": 100,
            "cloudTrackCount": 0,
            "coverImgUrl": "http://p1.music.126.net/GPkBo_4Y05NCIAUN--dEHw==/18919296579634292.jpg",
            "coverImgId": 18919296579634292,
            "description": "12月17日重新选曲，删减并增加了部分歌手，对百分之95的歌手代表曲目进行了替换\n\n由于字数限制只介绍一部分，其他歌手也值得大家深入了解\n\n1:【Ed Sheeran】第32届全英音乐奖最佳男歌手，专辑“×”是英国2014年的销量冠军，并成为当年的最佳专辑。和专辑女王Adele相对应的，他是单曲皇帝。单曲“Thinking Out Loud”卖出1950万份拷贝，位居21世纪第三位。2017年发行“Shape of You\"，英国乐坛迎来了历史上第3首认证5白金的单曲。同年发行第三张录音室专辑“÷”，专辑所有曲目全部进入前20，这是史无前例的事件\n\n2:【Charlie Puth】“See You Again\"卖出2090万份拷贝，位居21世纪第一名。MV是YouTube网站播放最多的视频，达到了30亿\n\n3:【Sam Smith】和Ed Sheeran平分秋色的英国顶尖歌手。2015年拿到年度单曲，年度制作，年度专辑，年度新人4项格莱美\n\n4:【Justin Bieber】15岁时他就拿到了和格莱美齐名的全美音乐奖。2015年和英国巨星Adele在全英单曲榜上厮杀，强行压制Adele在英国登顶。在市场更大的美国，凭借“Love Yourself\"和“Sorry”霸占年度销量榜前两名。没有任何一个人可以在相同的年纪里取得和他并肩的成就。\n\n5:【One Direction全员】“What Makes You Beautiful\"不仅拿到了全英音乐奖，还帮助这个成立只有1年的组合获得了美国的青睐，这是包括西城和TT在内的诸多顶尖男团都没有做到的事。2013年发行的第三张录音室专辑“Midnight Memories”成为全球年度销量冠军，全球最顶尖组合名副其实\n\n6:【迪斯尼重点培养的3名少女明星】\n【Selena】代表作“We Don't Talk Anymore\"\n【Miley】发行的电视原声带登上公告牌榜首\n【Demi】代表作“Let It Go”\n\n7:【Marcua Warner】以成为全职电影配乐家为目标。想完成的事是：可以把流行乐和管弦乐联系起来\n\n8:【Against the Current】2017年演唱英雄联盟全球总决赛主题曲“Legends Never Die”\n\n9:【Louisa Johnson】X Factor最年轻的冠军，夺冠时只有17岁",
            "tags": [
                "欧美",
                "流行",
                "90后"
            ],
            "playCount": 9533817,
            "trackUpdateTime": 1513686879636,
            "specialType": 0,
            "totalDuration": 0,
            "creator": {
                "defaultAvatar": false,
                "province": 370000,
                "authStatus": 0,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/W8qT3N7hxEadFO3PS1vWRA==/19229358858621885.jpg",
                "accountStatus": 0,
                "gender": 1,
                "city": 371500,
                "birthday": 913305600000,
                "userId": 92582150,
                "userType": 0,
                "nickname": "第十三个神",
                "signature": "宙斯翻译组群号：544038513【一个线上翻译歌词的组织】",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 19229358858621884,
                "backgroundImgId": 18546562139475844,
                "backgroundUrl": "http://p1.music.126.net/4hriPe2hHBBbnGGy8C98ig==/18546562139475844.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": [
                    "欧美"
                ],
                "experts": null,
                "djStatus": 10,
                "vipType": 10,
                "remarkName": null,
                "avatarImgIdStr": "19229358858621885",
                "backgroundImgIdStr": "18546562139475844",
                "avatarImgId_str": "19229358858621885"
            },
            "tracks": null,
            "subscribers": [
                {
                    "defaultAvatar": false,
                    "province": 360000,
                    "authStatus": 0,
                    "followed": false,
                    "avatarUrl": "http://p1.music.126.net/KfyCO96683qTyRWvMbto-w==/19116109160900108.jpg",
                    "accountStatus": 0,
                    "gender": 2,
                    "city": 360100,
                    "birthday": -2209017600000,
                    "userId": 584178800,
                    "userType": 0,
                    "nickname": "准港中大商学院学生",
                    "signature": "",
                    "description": "",
                    "detailDescription": "",
                    "avatarImgId": 19116109160900108,
                    "backgroundImgId": 19099616486519212,
                    "backgroundUrl": "http://p1.music.126.net/RK-1U6XHDp9gjsFRFvYvTg==/19099616486519213.jpg",
                    "authority": 0,
                    "mutual": false,
                    "expertTags": null,
                    "experts": null,
                    "djStatus": 0,
                    "vipType": 0,
                    "remarkName": null,
                    "avatarImgIdStr": "19116109160900108",
                    "backgroundImgIdStr": "19099616486519213",
                    "avatarImgId_str": "19116109160900108"
                }
            ],
            "subscribed": false,
            "commentThreadId": "A_PL_0_733122887",
            "newImported": false,
            "adType": 0,
            "highQuality": true,
            "privacy": 0,
            "ordered": true,
            "anonimous": false,
            "shareCount": 1167,
            "coverImgId_str": "18919296579634292",
            "commentCount": 1772,
            "copywriter": "欢迎大家收听“什么？他们竟然是90后？ ”系列",
            "tag": "欧美"
        },
        {
            "name": "这些充满『强烈画面感』的音乐",
            "id": 156934569,
            "trackNumberUpdateTime": 1508504406552,
            "status": 0,
            "userId": 31925677,
            "createTime": 1453260912133,
            "updateTime": 1512896790135,
            "subscribedCount": 876971,
            "trackCount": 448,
            "cloudTrackCount": 0,
            "coverImgUrl": "http://p1.music.126.net/uXbDB1aWsp36_I_lQs-DeA==/1411772930113118.jpg",
            "coverImgId": 1411772930113118,
            "description": "与其说是画面感，更不如说是80、90后的回忆。歌单包含了我们这一代人从小到大耳熟能详的音乐。从周星驰到新闻联播，从大风车到数码宝贝，从法兰城到魔兽世界，总会有一首能让你回想起生命中最美好的时刻。\n\n01-20：周星驰系列音乐\n音乐在对情绪的渲染是最直接有效的，周星驰电影里出现过数以百计的歌曲，大部分都是用来解构、戏谑，其中很多更由他亲自唱起。它们或励志，或伤感，或诙谐，或深情，和电影一起打动了无数观众。\n\n20-30：电视台背景音乐\n中央电视台的一些常用音乐，几十年如一日。只要听到这熟悉的旋律，就会想起小时候跟爷爷奶奶一起看电视的日子。\n\n31-43：学生时代的记忆\n几乎每个学校都是这些音乐，除此之外还有广播体操。有多少人喜欢做体操只是为了可以在体转运动时回头偷看一个人？\n\n44-68：耳熟能详的音乐\n包含一些曾经在电视上频繁播放过的音乐。\n\n69-91：86版西游记歌曲\n经典的86版西游记电视剧配乐原声，节选其中几首。贯穿了我们的整个暑假，百看不厌，百听不腻。\n\n92-104：网络恶搞音乐\n从雷军到奥巴马，没被恶搞过的人不叫名人。\n\n105-216：电视剧、影视歌曲\n小时候有太多经典的电视剧，你能说出几部？每首片头片尾曲都能够成为经典。\n\n217-239：经典流行歌曲\n10年前，你在听什么歌？那个时候，不只有周杰伦，也没那么容易出道。\n\n240-258：鬼畜、另类歌曲\n网友是有才的，这里有江南皮革厂，也有滑板鞋。\n\n259-363：动漫卡通歌曲\n我们的童年是大风车、动画城、数码宝贝、神奇宝贝。这里没有喜羊羊，没有熊大熊二。\n\n364-448：游戏音乐\n你还记得这些伴随我们童年的声音吗？超级玛丽、魂斗罗、马戏团等，永不褪色的童年回忆。\n",
            "tags": [
                "华语",
                "放松",
                "影视原声"
            ],
            "playCount": 40445376,
            "trackUpdateTime": 1513796888053,
            "specialType": 0,
            "totalDuration": 0,
            "creator": {
                "defaultAvatar": false,
                "province": 350000,
                "authStatus": 0,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/XUOL_7vvPICLsF-t0hS1zQ==/109951163044041721.jpg",
                "accountStatus": 0,
                "gender": 1,
                "city": 350200,
                "birthday": 654192000000,
                "userId": 31925677,
                "userType": 0,
                "nickname": "半泽树",
                "signature": "云村自媒体，每日分享新鲜有趣的短视频，如有侵权，请联系删除。本身是一名摇滚爱好者，披头士、大卫鲍伊粉丝。",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 109951163044041730,
                "backgroundImgId": 109951163039740560,
                "backgroundUrl": "http://p1.music.126.net/obV7H1zUaj9kDPyK45kHjQ==/109951163039740567.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": [
                    "影视原声",
                    "欧美"
                ],
                "experts": {
                    "1": "视频达人"
                },
                "djStatus": 10,
                "vipType": 11,
                "remarkName": null,
                "avatarImgIdStr": "109951163044041721",
                "backgroundImgIdStr": "109951163039740567",
                "avatarImgId_str": "109951163044041721"
            },
            "tracks": null,
            "subscribers": [
                {
                    "defaultAvatar": false,
                    "province": 230000,
                    "authStatus": 0,
                    "followed": false,
                    "avatarUrl": "http://p1.music.126.net/e_k7_iddMPYEsf0CMjVOkQ==/109951162895539086.jpg",
                    "accountStatus": 0,
                    "gender": 1,
                    "city": 230100,
                    "birthday": -2209017600000,
                    "userId": 447283797,
                    "userType": 0,
                    "nickname": "孫django",
                    "signature": "",
                    "description": "",
                    "detailDescription": "",
                    "avatarImgId": 109951162895539090,
                    "backgroundImgId": 109951162868126480,
                    "backgroundUrl": "http://p1.music.126.net/_f8R60U9mZ42sSNvdPn2sQ==/109951162868126486.jpg",
                    "authority": 0,
                    "mutual": false,
                    "expertTags": null,
                    "experts": null,
                    "djStatus": 0,
                    "vipType": 0,
                    "remarkName": null,
                    "avatarImgIdStr": "109951162895539086",
                    "backgroundImgIdStr": "109951162868126486",
                    "avatarImgId_str": "109951162895539086"
                }
            ],
            "subscribed": false,
            "commentThreadId": "A_PL_0_156934569",
            "newImported": false,
            "adType": 0,
            "highQuality": true,
            "privacy": 0,
            "ordered": true,
            "anonimous": false,
            "shareCount": 38705,
            "commentCount": 11662,
            "copywriter": "总有一首歌能让你回想起生命中那些最美好的时刻",
            "tag": "华语"
        }
    ],
    "code": 200,
    "more": true,
    "lasttime": 1512896790135,
    "total": 222
}
```

### 获取歌单详情

**这个反人类的命名，让人产生直接调网易云接口的冲动**

[http://116.196.87.226:3000/playlist/detail?id=2023423393](http://116.196.87.226:3000/playlist/detail?id=2023423393)

```
{
    "playlist": {
        "subscribers": [],
        "subscribed": false,
        "creator": {
            "defaultAvatar": true,
            "province": 210000,
            "authStatus": 0,
            "followed": false,
            "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
            "accountStatus": 0,
            "gender": 0,
            "city": 210200,
            "birthday": -2209017600000,
            "userId": 1317458286,
            "userType": 0,
            "nickname": "我任何人都不是",
            "signature": "",
            "description": "",
            "detailDescription": "",
            "avatarImgId": 18686200114669624,
            "backgroundImgId": 109951162868128400,
            "backgroundUrl": "http://p1.music.126.net/2zSNIqTcpHL2jIvU6hG0EA==/109951162868128395.jpg",
            "authority": 0,
            "mutual": false,
            "expertTags": null,
            "experts": null,
            "djStatus": 0,
            "vipType": 0,
            "remarkName": null,
            "avatarImgIdStr": "18686200114669622",
            "backgroundImgIdStr": "109951162868128395",
            "avatarImgId_str": "18686200114669622"
        },
        "tracks": [
            {
                "name": "恋爱循环 - 左右声道音乐娘制作",
                "id": 34341540,
                "pst": 0,
                "t": 0,
                "ar": [
                    {
                        "id": 16456,
                        "name": "花澤香菜",
                        "tns": [],
                        "alias": []
                    },
                    {
                        "id": 16690,
                        "name": "釘宮理恵",
                        "tns": [],
                        "alias": []
                    }
                ],
                "alia": [],
                "pop": 100,
                "st": 0,
                "rt": null,
                "fee": 0,
                "v": 465,
                "crbt": null,
                "cf": "",
                "al": {
                    "id": 3271560,
                    "name": "最新热歌慢摇110",
                    "picUrl": "http://p1.music.126.net/qUliwrBDR_QBjNIyipbIRQ==/3296335861579907.jpg",
                    "tns": [],
                    "pic": 3296335861579907
                },
                "dt": 254720,
                "h": null,
                "m": null,
                "l": {
                    "br": 96000,
                    "fid": 0,
                    "size": 3057310,
                    "vd": -0.53
                },
                "a": null,
                "cd": "",
                "no": 1,
                "rtUrl": null,
                "ftype": 0,
                "rtUrls": [],
                "djId": 0,
                "copyright": 2,
                "s_id": 0,
                "cp": 0,
                "mv": 0,
                "rtype": 0,
                "rurl": null,
                "mst": 9,
                "publishTime": 1388505600004
            },
            {
                "name": "Anywhere",
                "id": 514055280,
                "pst": 0,
                "t": 0,
                "ar": [
                    {
                        "id": 74575,
                        "name": "Rita Ora",
                        "tns": [],
                        "alias": []
                    }
                ],
                "alia": [],
                "pop": 100,
                "st": 0,
                "rt": null,
                "fee": 8,
                "v": 23,
                "crbt": null,
                "cf": "",
                "al": {
                    "id": 36632041,
                    "name": "Anywhere",
                    "picUrl": "http://p1.music.126.net/6m8cyoQrTvqaplZGx4iuxA==/109951163046410809.jpg",
                    "tns": [],
                    "pic_str": "109951163046410809",
                    "pic": 109951163046410820
                },
                "dt": 214332,
                "h": {
                    "br": 320000,
                    "fid": 0,
                    "size": 8575521,
                    "vd": -3
                },
                "m": {
                    "br": 192000,
                    "fid": 0,
                    "size": 5145330,
                    "vd": -2
                },
                "l": {
                    "br": 128000,
                    "fid": 0,
                    "size": 3430235,
                    "vd": -2
                },
                "a": null,
                "cd": "1",
                "no": 1,
                "rtUrl": null,
                "ftype": 0,
                "rtUrls": [],
                "djId": 0,
                "copyright": 2,
                "s_id": 0,
                "cp": 7001,
                "mv": 5687027,
                "rtype": 0,
                "rurl": null,
                "mst": 9,
                "publishTime": 1508457600000
            }
        ],
        "trackIds": [
            {
                "id": 34341540,
                "v": 466
            },
            {
                "id": 514055280,
                "v": 24
            }
        ],
        "ordered": false,
        "tags": [],
        "status": 0,
        "subscribedCount": 0,
        "cloudTrackCount": 1,
        "updateTime": 1513839634576,
        "privacy": 0,
        "newImported": false,
        "specialType": 5,
        "coverImgId": 3422779698817209,
        "createTime": 1513839151074,
        "coverImgUrl": "http://p1.music.126.net/JpBJUNOXqGtVxRUxF5Y0eg==/3422779698817209.jpg",
        "trackUpdateTime": 1513843970028,
        "trackCount": 2,
        "highQuality": false,
        "commentThreadId": "A_PL_0_2023423393",
        "userId": 1317458286,
        "playCount": 0,
        "adType": 0,
        "description": null,
        "trackNumberUpdateTime": 1513839634576,
        "name": "我任何人都不是喜欢的音乐",
        "id": 2023423393,
        "shareCount": 0,
        "commentCount": 0
    },
    "code": 200,
    "privileges": [
        {
            "id": 34341540,
            "fee": 0,
            "payed": 0,
            "st": 0,
            "pl": 96000,
            "dl": 96000,
            "sp": 7,
            "cp": 1,
            "subp": 1,
            "cs": false,
            "maxbr": 96000,
            "fl": 320000,
            "toast": false,
            "flag": 0
        },
        {
            "id": 514055280,
            "fee": 8,
            "payed": 1,
            "st": 0,
            "pl": 999000,
            "dl": 999000,
            "sp": 7,
            "cp": 1,
            "subp": 1,
            "cs": false,
            "maxbr": 999000,
            "fl": 128000,
            "toast": false,
            "flag": 0
        }
    ]
}
```

### 添加或删除歌单歌曲

#### 添加

[http://116.196.87.226:3000/playlist/tracks?op=add&pid=2023423393&tracks=289145](http://116.196.87.226:3000/playlist/tracks?op=add&pid=2023423393&tracks=289145)

添加成功

```
{
    "trackIds": "[289145]",
    "code": 200,
    "count": 3,
    "cloudCount": 1
}
```

添加重复

```
{
    "code": 502
}
```

#### 删除

[http://116.196.87.226:3000/playlist/tracks?op=del&pid=2023423393&tracks=289145](http://116.196.87.226:3000/playlist/tracks?op=del&pid=2023423393&tracks=289145)

```
{
    "code": 200,
    "count": 2,
    "cloudCount": 1
}
```
