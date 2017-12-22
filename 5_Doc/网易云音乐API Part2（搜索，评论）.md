---
title: 网易云音乐API Part2（搜索，评论）
date: 2017-12-22 11:39:14
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

## 搜索

### 搜索

type: 搜索类型；默认为1即单曲,取值意义:

1: 单曲

10: 专辑

100: 歌手

1000: 歌单

1002: 用户

1004: MV

1006: 歌词

1009: 电台

#### 搜索歌曲

[http://116.196.87.226:3000/search?keywords=ゆうべは俺が悪かった&limit=1&type=1](http://116.196.87.226:3000/search?keywords=ゆうべは俺が悪かった&limit=1&type=1)

```
{
    "result": {
        "songs": [
            {
                "id": 22660461,
                "name": "ゆうべは俺が悪かった",
                "artists": [
                    {
                        "id": 19678,
                        "name": "ハンバート ハンバート",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 2078074,
                    "name": "ニッケル·オデオン ",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1309881600007,
                    "size": 6,
                    "copyrightId": 5003,
                    "status": 1,
                    "picId": 853221023177754
                },
                "duration": 195004,
                "copyrightId": 5003,
                "status": 0,
                "alias": [
                    "昨晚我错了"
                ],
                "rtype": 0,
                "ftype": 0,
                "mvid": 0,
                "fee": 0,
                "rUrl": null
            }
        ],
        "songCount": 1
    },
    "code": 200
}
```

#### 搜索专辑

[http://116.196.87.226:3000/search?keywords=reputation&limit=1&type=10](http://116.196.87.226:3000/search?keywords=reputation&limit=1&type=10)

```
{
    "result": {
        "albums": [
            {
                "name": "reputation",
                "id": 36709029,
                "type": "专辑",
                "size": 15,
                "picId": 109951163054654500,
                "blurPicUrl": "http://p3.music.126.net/fdh0myRe6FD87QNJtvGe_A==/109951163054654501.jpg",
                "companyId": 0,
                "pic": 109951163054654500,
                "picUrl": "http://p4.music.126.net/fdh0myRe6FD87QNJtvGe_A==/109951163054654501.jpg",
                "publishTime": 1510243200007,
                "description": "",
                "tags": "",
                "company": "环球唱片",
                "briefDesc": "",
                "artist": {
                    "name": "Taylor Swift",
                    "id": 44266,
                    "picId": 109951163011137120,
                    "img1v1Id": 18686200114669624,
                    "briefDesc": "",
                    "picUrl": "http://p3.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                    "img1v1Url": "http://p3.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                    "albumSize": 57,
                    "alias": [],
                    "trans": "泰勒·斯威夫特",
                    "musicSize": 691,
                    "topicPerson": 0,
                    "picId_str": "109951163011137119",
                    "transNames": [
                        "泰勒·斯威夫特"
                    ],
                    "img1v1Id_str": "18686200114669622",
                    "alia": []
                },
                "songs": null,
                "alias": [],
                "status": -4,
                "copyrightId": 7003,
                "commentThreadId": "R_AL_3_36709029",
                "artists": [
                    {
                        "name": "Taylor Swift",
                        "id": 44266,
                        "picId": 0,
                        "img1v1Id": 18686200114669624,
                        "briefDesc": "",
                        "picUrl": "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1Url": "http://p3.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                        "albumSize": 0,
                        "alias": [],
                        "trans": "",
                        "musicSize": 0,
                        "topicPerson": 0,
                        "img1v1Id_str": "18686200114669622"
                    }
                ],
                "paid": false,
                "onSale": true,
                "picId_str": "109951163054654501",
                "containedSong": "",
                "alg": "alg_album_basic_a"
            }
        ],
        "albumCount": 31
    },
    "code": 200
}
```

#### 搜索歌手

[http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=100](http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=100)

```
{
    "result": {
        "artistCount": 250,
        "artists": [
            {
                "id": 44266,
                "name": "Taylor Swift",
                "picUrl": "http://p1.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                "alias": [],
                "albumSize": 57,
                "picId": 109951163011137120,
                "img1v1Url": "http://p1.music.126.net/xrtDrby2JBO8e70ySagyIw==/109951163011222879.jpg",
                "img1v1": 109951163011222880,
                "transNames": [
                    "泰勒·斯威夫特"
                ],
                "mvSize": 171,
                "followed": true,
                "alg": "alg_artist_basic",
                "trans": "泰勒·斯威夫特"
            }
        ]
    },
    "code": 200
}
```

#### 搜索歌单

[http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1000](http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1000)

```
{
    "result": {
        "playlists": [
            {
                "id": 898072985,
                "name": "Taylor Swift 丨才女的进化史",
                "coverImgUrl": "http://p1.music.126.net/BTcjC3VWx0yF8kCcm1uYUA==/19071029184142858.jpg",
                "creator": {
                    "nickname": "冷山集",
                    "userId": 104388569,
                    "userType": 0,
                    "authStatus": 0,
                    "expertTags": null,
                    "experts": null
                },
                "subscribed": false,
                "trackCount": 53,
                "userId": 104388569,
                "playCount": 7883395,
                "bookCount": 213586,
                "highQuality": false,
                "alg": "alg_playlist_basic"
            }
        ],
        "playlistCount": 356
    },
    "code": 200
}
```

#### 搜索用户

[http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1002](http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1002)

```
{
    "result": {
        "userprofiles": [
            {
                "defaultAvatar": false,
                "province": 1000000,
                "authStatus": 1,
                "followed": false,
                "avatarUrl": "http://p1.music.126.net/AcY8qnM3_EX6Olc0TnaSZw==/109951163063557302.jpg",
                "accountStatus": 0,
                "gender": 1,
                "city": 1010000,
                "birthday": 761500800000,
                "userId": 14709960,
                "userType": 4,
                "nickname": "Taylor__Bear",
                "signature": "欢迎彩虹骚年们关注我~不定期发车！",
                "description": "",
                "detailDescription": "",
                "avatarImgId": 109951163063557300,
                "backgroundImgId": 109951162997046320,
                "backgroundUrl": "http://p1.music.126.net/ChnwEKTMHfCiJasaLO16qQ==/109951162997046318.jpg",
                "authority": 0,
                "mutual": false,
                "expertTags": null,
                "experts": null,
                "djStatus": 10,
                "vipType": 11,
                "remarkName": null,
                "avatarImgIdStr": "109951163063557302",
                "backgroundImgIdStr": "109951162997046318",
                "avatarImgId_str": "109951163063557302",
                "alg": "alg_user_basic"
            }
        ],
        "userprofileCount": 600
    },
    "code": 200
}
```

#### 搜索MV

[http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1004](http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1004)

```
{
    "result": {
        "mvCount": 276,
        "mvs": [
            {
                "id": 5647227,
                "cover": "http://p4.music.126.net/_n5bnOjfCWI5USfGE8cerg==/109951163018611090.jpg",
                "name": "Look What You Made Me Do",
                "playCount": 13730884,
                "briefDesc": "暗黑Taylor惊艳上线",
                "desc": null,
                "artistName": "Taylor Swift",
                "artistId": 44266,
                "duration": 256000,
                "mark": 0,
                "subed": false,
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "alias": [
                            "泰勒斯威夫特",
                            "泰勒史薇芙特",
                            "泰勒斯威芙特",
                            "霉霉"
                        ],
                        "transNames": [
                            "泰勒·斯威夫特"
                        ]
                    }
                ],
                "arTransName": "泰勒·斯威夫特",
                "alg": "alg_mv_basic_a"
            }
        ]
    },
    "code": 200
}
```

#### 搜索歌词

[http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1006](http://116.196.87.226:3000/search?keywords=taylor&limit=1&type=1006)

```
{
    "result": {
        "songs": [
            {
                "id": 501133611,
                "name": "Look What You Made Me Do",
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 36709029,
                    "name": "reputation",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1510243200007,
                    "size": 15,
                    "copyrightId": 7003,
                    "status": -4,
                    "picId": 109951163054654500
                },
                "duration": 211859,
                "copyrightId": 7003,
                "status": 0,
                "alias": [],
                "rtype": 0,
                "ftype": 0,
                "mvid": 5647227,
                "fee": 4,
                "rUrl": null,
                "lyrics": {
                    "txt": "I don't like your little games\nDon't like your tilted stage\nThe role you made me play\nOf the fool, no, I don't like you\nI don't like your perfect crime\nHow you laugh when you lie\nYou said the gun was mine\nIsn't cool, no, I don't like you (oh!)\nBut I got smarter, I got harder in the nick of time\nHoney, I rose up from the dead, I do it all the time\nI’ve got a list of names and yours is in red, underlined\nI check it once, then I check it twice, oh!\nOhh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nOhh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nI don't like your kingdom keys\nThey once belonged to me\nYou ask me for a place to sleep\nLocked me out and threw a feast (what?)\nThe world moves on, another day, another drama, drama\nBut not for me, not for me, all I think about is karma\nAnd then the world moves on but one thing's for sure\nMaybe I got mine, but you'll all get yours\nBut I got smarter, I got harder in the nick of time\nHoney, I rose up from the dead, I do it all the time\nI’ve got a list of names and yours is in red, underlined\nI check it once, then I check it twice, oh!\nOhh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nOhh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nI don't trust nobody and nobody trusts me\nI'll be the actress starring in your bad dreams\nI don't trust nobody and nobody trusts me\nI'll be the actress starring in your bad dreams\nI don't trust nobody and nobody trusts me\nI'll be the actress starring in your bad dreams\nI don't trust nobody and nobody trusts me\nI'll be the actress starring in your bad dreams\n(Look what you made me do)\n(Look what you made me do)\n”I’m sorry, the old Taylor can't come to the phone right now.\n”Why?”\n”Oh, 'cause she's dead!\" (ohh!)\nOoh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nOoh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nOoh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\nOoh, look what you made me do\nLook what you made me do\nLook what you just made me do\nLook what you just made me do\n",
                    "range": [
                        {
                            "first": 1883,
                            "second": 1889
                        }
                    ]
                },
                "alg": "default"
            }
        ],
        "songCount": 60
    },
    "code": 200
}
```

#### 搜索电台

[http://116.196.87.226:3000/search?keywords=东京塔子&limit=1&type=1009](http://116.196.87.226:3000/search?keywords=东京塔子&limit=1&type=1009)

```
{
    "result": {
        "djRadios": [
            {
                "id": 7356034,
                "dj": {
                    "defaultAvatar": false,
                    "province": 1000000,
                    "authStatus": 1,
                    "followed": false,
                    "avatarUrl": "http://p1.music.126.net/7S3390P4hd62UGMBgXamZw==/7705377487815719.jpg",
                    "accountStatus": 0,
                    "gender": 2,
                    "city": 1004400,
                    "birthday": 801547200000,
                    "userId": 52228633,
                    "userType": 4,
                    "nickname": "东京塔子",
                    "signature": "中日英都唱，但咱是中国人好伐。 / Q群206792573",
                    "description": "",
                    "detailDescription": "",
                    "avatarImgId": 7705377487815719,
                    "backgroundImgId": 109951163077371520,
                    "backgroundUrl": "http://p1.music.126.net/pfsHorlQ9RXykxEyFLU8eA==/109951163077371521.jpg",
                    "authority": 0,
                    "mutual": false,
                    "expertTags": null,
                    "experts": null,
                    "djStatus": 10,
                    "vipType": 10,
                    "remarkName": null,
                    "avatarImgIdStr": "7705377487815719",
                    "backgroundImgIdStr": "109951163077371521"
                },
                "name": "东京塔子的电台",
                "picUrl": "http://p1.music.126.net/6DM1_NwTWYEx0Pf93mdTyw==/19217264230476204.jpg",
                "desc": "翻唱歌手，中日英都唱。\nB站ID东京塔子 | 微博@东京塔子",
                "subCount": 19352,
                "programCount": 56,
                "createTime": 1454922861164,
                "categoryId": 2001,
                "category": "创作|翻唱",
                "radioFeeType": 0,
                "feeScope": 0,
                "buyed": false,
                "videos": null,
                "finished": false,
                "underShelf": false,
                "purchaseCount": 0,
                "price": 0,
                "originalPrice": 0,
                "discountPrice": null,
                "lastProgramCreateTime": 1512280841667,
                "lastProgramName": "【翻唱】ALIVE（《终结者2：审判日》赛事主题曲）",
                "lastProgramId": 1366841728,
                "picId": 19217264230476204,
                "rcmdText": "多语种翻唱，甜出少女心",
                "composeVideo": false,
                "shareCount": 36,
                "rcmdtext": "多语种翻唱，甜出少女心",
                "likedCount": 0,
                "alg": "alg_djradio_basic",
                "commentCount": 0
            },
            {
                "id": 350351084,
                "dj": {
                    "defaultAvatar": false,
                    "province": 110000,
                    "authStatus": 0,
                    "followed": false,
                    "avatarUrl": "http://p1.music.126.net/vEVtAUr22o0Jrag73nVXTA==/19190875951631111.jpg",
                    "accountStatus": 0,
                    "gender": 2,
                    "city": 110101,
                    "birthday": 928857600000,
                    "userId": 475472712,
                    "userType": 0,
                    "nickname": "tawako东京塔",
                    "signature": "守塔一生/头像为东京塔子日语原创滴滴答答太阳雨曲绘/画师：焦炭嚼",
                    "description": "",
                    "detailDescription": "",
                    "avatarImgId": 19190875951631110,
                    "backgroundImgId": 3241360282775989,
                    "backgroundUrl": "http://p1.music.126.net/fqxgqKu15cnfGoY_JcrX7A==/3241360282775989.jpg",
                    "authority": 0,
                    "mutual": false,
                    "expertTags": null,
                    "experts": null,
                    "djStatus": 10,
                    "vipType": 0,
                    "remarkName": null,
                    "avatarImgIdStr": "19190875951631111",
                    "backgroundImgIdStr": "3241360282775989",
                    "avatarImgId_str": "19190875951631111"
                },
                "name": "【东京塔子】原创曲合集",
                "picUrl": "http://p1.music.126.net/G6SjM0RIJwgH0xjGVmec5g==/18707090837011828.jpg",
                "desc": "b站知名唱见东京塔子原创曲",
                "subCount": 7,
                "programCount": 10,
                "createTime": 1504153919110,
                "categoryId": 2001,
                "category": "创作|翻唱",
                "radioFeeType": 0,
                "feeScope": 0,
                "buyed": false,
                "videos": null,
                "finished": false,
                "underShelf": false,
                "purchaseCount": 0,
                "price": 0,
                "originalPrice": 0,
                "discountPrice": null,
                "lastProgramCreateTime": 1510310178754,
                "lastProgramName": "Rainbow Adventure",
                "lastProgramId": 910702483,
                "picId": 18707090837011828,
                "rcmdText": null,
                "composeVideo": false,
                "shareCount": 0,
                "rcmdtext": null,
                "likedCount": 0,
                "alg": "alg_djradio_basic",
                "commentCount": 0
            }
        ],
        "djRadiosCount": 2
    },
    "code": 200
}
```

### 搜索建议

[http://116.196.87.226:3000/search/suggest?keywords=taylor&limit=1&type=1009](http://116.196.87.226:3000/search/suggest?keywords=taylor&limit=1&type=1009)

```
{
    "result": {
        "albums": [
            {
                "id": 36709029,
                "name": "reputation",
                "artist": {
                    "id": 44266,
                    "name": "Taylor Swift",
                    "picUrl": "http://p1.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                    "alias": [],
                    "albumSize": 57,
                    "picId": 109951163011137120,
                    "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                    "img1v1": 0,
                    "transNames": [
                        "泰勒·斯威夫特"
                    ],
                    "trans": "泰勒·斯威夫特"
                },
                "publishTime": 1510243200007,
                "size": 15,
                "copyrightId": 7003,
                "status": -4,
                "picId": 109951163054654500
            },
            {
                "id": 3029801,
                "name": "1989",
                "artist": {
                    "id": 44266,
                    "name": "Taylor Swift",
                    "picUrl": "http://p1.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                    "alias": [],
                    "albumSize": 57,
                    "picId": 109951163011137120,
                    "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                    "img1v1": 0,
                    "transNames": [
                        "泰勒·斯威夫特"
                    ],
                    "trans": "泰勒·斯威夫特"
                },
                "publishTime": 1414339200007,
                "size": 19,
                "copyrightId": 7003,
                "status": -4,
                "picId": 18771962022688348
            }
        ],
        "artists": [
            {
                "id": 44266,
                "name": "Taylor Swift",
                "picUrl": "http://p1.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                "alias": [],
                "albumSize": 57,
                "picId": 109951163011137120,
                "img1v1Url": "http://p1.music.126.net/xrtDrby2JBO8e70ySagyIw==/109951163011222879.jpg",
                "img1v1": 109951163011222880,
                "transNames": [
                    "泰勒·斯威夫特"
                ],
                "trans": "泰勒·斯威夫特"
            },
            {
                "id": 938031,
                "name": "Taylor Thrash",
                "picUrl": "http://p1.music.126.net/OfdVuTj2gkQdp0GFpd507Q==/1408474395783855.jpg",
                "alias": [],
                "albumSize": 2,
                "picId": 1408474395783855,
                "img1v1Url": "http://p1.music.126.net/Ku0QjGkS3i7AIXCAx3eOBA==/528865147329873.jpg",
                "img1v1": 528865147329873,
                "trans": null
            },
            {
                "id": 12095343,
                "name": "Taylor Bennett",
                "picUrl": "http://p1.music.126.net/5EBuzL0dHjQLV-VCc3yHtA==/18558656766902806.jpg",
                "alias": [],
                "albumSize": 6,
                "picId": 18558656766902810,
                "img1v1Url": "http://p1.music.126.net/X2lBYs-xOpsTe7lJQn3mRQ==/18763165929678342.jpg",
                "img1v1": 18763165929678344,
                "trans": null
            }
        ],
        "songs": [
            {
                "id": 29713617,
                "name": "Blank Space",
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 3064088,
                    "name": "Blank Space",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1415548800007,
                    "size": 1,
                    "copyrightId": 7003,
                    "status": -1,
                    "picId": 3231464674386227
                },
                "duration": 231000,
                "copyrightId": 7003,
                "status": 0,
                "alias": [],
                "rtype": 0,
                "ftype": 0,
                "mvid": 361153,
                "fee": 1,
                "rUrl": null
            },
            {
                "id": 19292800,
                "name": "Red",
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 1770428,
                    "name": "Red",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1350835200000,
                    "size": 16,
                    "copyrightId": 7003,
                    "status": -4,
                    "picId": 6621259023379377
                },
                "duration": 223093,
                "copyrightId": 7003,
                "status": 0,
                "alias": [],
                "rtype": 0,
                "ftype": 0,
                "mvid": 113112,
                "fee": 1,
                "rUrl": null
            },
            {
                "id": 501133611,
                "name": "Look What You Made Me Do",
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 36709029,
                    "name": "reputation",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1510243200007,
                    "size": 15,
                    "copyrightId": 7003,
                    "status": -4,
                    "picId": 109951163054654500
                },
                "duration": 211859,
                "copyrightId": 7003,
                "status": 0,
                "alias": [],
                "rtype": 0,
                "ftype": 0,
                "mvid": 5647227,
                "fee": 4,
                "rUrl": null
            },
            {
                "id": 19292984,
                "name": "Love Story",
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    }
                ],
                "album": {
                    "id": 1770438,
                    "name": "Fearless",
                    "artist": {
                        "id": 0,
                        "name": "",
                        "picUrl": null,
                        "alias": [],
                        "albumSize": 0,
                        "picId": 0,
                        "img1v1Url": "http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1": 0,
                        "trans": null
                    },
                    "publishTime": 1226332800007,
                    "size": 13,
                    "copyrightId": 7003,
                    "status": -4,
                    "picId": 18517974836953200
                },
                "duration": 236251,
                "copyrightId": 7003,
                "status": 0,
                "alias": [],
                "rtype": 0,
                "ftype": 0,
                "mvid": 503185,
                "fee": 1,
                "rUrl": null
            }
        ],
        "playlists": [
            {
                "id": 898072985,
                "name": "Taylor Swift 丨才女的进化史",
                "coverImgUrl": "http://p1.music.126.net/BTcjC3VWx0yF8kCcm1uYUA==/19071029184142858.jpg",
                "creator": null,
                "subscribed": false,
                "trackCount": 53,
                "userId": 104388569,
                "playCount": 7883492,
                "bookCount": 213582,
                "highQuality": false
            },
            {
                "id": 711892958,
                "name": "Taylor Swift（泰勒斯威夫特）歌曲大全",
                "coverImgUrl": "http://p1.music.126.net/cCfpVmx1M6M-vr4u6bWisw==/109951163028182831.jpg",
                "creator": null,
                "subscribed": false,
                "trackCount": 112,
                "userId": 375595964,
                "playCount": 47618,
                "bookCount": 1116,
                "highQuality": false
            }
        ],
        "mvs": [
            {
                "id": 5647227,
                "cover": "http://p3.music.126.net/_n5bnOjfCWI5USfGE8cerg==/109951163018611090.jpg",
                "name": "Look What You Made Me Do",
                "playCount": 13731048,
                "briefDesc": "暗黑Taylor惊艳上线",
                "desc": null,
                "artistName": "Taylor Swift",
                "artistId": 44266,
                "duration": 256000,
                "mark": 0,
                "subed": false,
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "alias": [
                            "泰勒斯威夫特",
                            "泰勒史薇芙特",
                            "泰勒斯威芙特",
                            "霉霉"
                        ],
                        "transNames": [
                            "泰勒·斯威夫特"
                        ]
                    }
                ]
            },
            {
                "id": 5776032,
                "cover": "http://p4.music.126.net/tOK9V95ojQDP8BFS7yp0vQ==/109951163085245958.jpg",
                "name": "...Ready For It? (BloodPop® Remix)",
                "playCount": 292940,
                "briefDesc": "",
                "desc": null,
                "artistName": "Taylor Swift",
                "artistId": 44266,
                "duration": 192000,
                "mark": 0,
                "subed": false,
                "artists": [
                    {
                        "id": 44266,
                        "name": "Taylor Swift",
                        "alias": [
                            "泰勒斯威夫特",
                            "泰勒史薇芙特",
                            "泰勒斯威芙特",
                            "霉霉"
                        ],
                        "transNames": [
                            "泰勒·斯威夫特"
                        ]
                    },
                    {
                        "id": 12567543,
                        "name": "BloodPop",
                        "alias": [
                            "Michael Tucker",
                            "BloodPop®"
                        ],
                        "transNames": null
                    }
                ]
            }
        ],
        "order": [
            "songs",
            "artists",
            "albums",
            "mvs",
            "playlists"
        ]
    },
    "code": 200
}
```

### 搜索多重匹配

[http://116.196.87.226:3000/search/multimatch?keywords=taylor](http://116.196.87.226:3000/search/multimatch?keywords=taylor)

```
{
    "result": {
        "artist": [
            {
                "name": "Taylor Swift",
                "id": 44266,
                "picId": 109951163011137120,
                "img1v1Id": 109951163011222880,
                "briefDesc": "",
                "picUrl": "http://p1.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                "img1v1Url": "http://p1.music.126.net/xrtDrby2JBO8e70ySagyIw==/109951163011222879.jpg",
                "albumSize": 57,
                "alias": [],
                "trans": "泰勒·斯威夫特",
                "musicSize": 692,
                "picId_str": "109951163011137119",
                "transNames": [
                    "泰勒·斯威夫特"
                ],
                "img1v1Id_str": "109951163011222879",
                "mvSize": 171,
                "alg": "default"
            }
        ],
        "album": [
            {
                "name": "...Ready For It? (BloodPop® Remix)",
                "id": 36902122,
                "type": "EP/Single",
                "size": 1,
                "picId": 17861566393618284,
                "blurPicUrl": "http://p3.music.126.net/A13d0A4FWokkA9W9cET5-g==/17861566393618284.jpg",
                "companyId": 0,
                "pic": 17861566393618284,
                "picUrl": "http://p3.music.126.net/A13d0A4FWokkA9W9cET5-g==/17861566393618284.jpg",
                "publishTime": 1512057600007,
                "description": "",
                "tags": "",
                "company": "环球唱片",
                "briefDesc": "",
                "artist": {
                    "name": "Taylor Swift",
                    "id": 44266,
                    "picId": 109951163011137120,
                    "img1v1Id": 18686200114669624,
                    "briefDesc": "",
                    "picUrl": "http://p3.music.126.net/cCAPoZwlxudh_3Mp2sqQBw==/109951163011137119.jpg",
                    "img1v1Url": "http://p3.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                    "albumSize": 57,
                    "alias": [],
                    "trans": "泰勒·斯威夫特",
                    "musicSize": 692,
                    "topicPerson": 0,
                    "picId_str": "109951163011137119",
                    "transNames": [
                        "泰勒·斯威夫特"
                    ],
                    "img1v1Id_str": "18686200114669622"
                },
                "songs": null,
                "alias": [],
                "status": 3,
                "copyrightId": 7003,
                "commentThreadId": "R_AL_3_36902122",
                "artists": [
                    {
                        "name": "Taylor Swift",
                        "id": 44266,
                        "picId": 0,
                        "img1v1Id": 18686200114669624,
                        "briefDesc": "",
                        "picUrl": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1Url": "http://p4.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                        "albumSize": 0,
                        "alias": [],
                        "trans": "",
                        "musicSize": 0,
                        "topicPerson": 0,
                        "img1v1Id_str": "18686200114669622"
                    },
                    {
                        "name": "BloodPop",
                        "id": 12567543,
                        "picId": 0,
                        "img1v1Id": 18686200114669624,
                        "briefDesc": "",
                        "picUrl": "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg",
                        "img1v1Url": "http://p4.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                        "albumSize": 0,
                        "alias": [],
                        "trans": "",
                        "musicSize": 0,
                        "topicPerson": 0,
                        "img1v1Id_str": "18686200114669622"
                    }
                ],
                "paid": false,
                "onSale": false,
                "picId_str": "17861566393618284",
                "alg": "default"
            }
        ],
        "orders": [
            "album",
            "artist"
        ]
    },
    "code": 200
}
```

## 评论

### 歌曲评论

[http://116.196.87.226:3000/comment/music?id=289145&limit=1&offset=0](http://116.196.87.226:3000/comment/music?id=289145&limit=1&offset=0)

```
{
    "isMusician": false,
    "userId": 1317458286,
    "topComments": [],
    "moreHot": true,
    "hotComments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/yMjtRjIt56qufl66P4KcVQ==/3301833419741194.jpg",
                "experts": null,
                "userId": 51441885,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "陈小小小小小小"
            },
            "beReplied": [],
            "likedCount": 1912,
            "commentId": 37301532,
            "liked": false,
            "time": 1442975978872,
            "content": "我珍惜小时候对美好的最初印象，所以对于那些关于宋祖英的污言秽语特别反感，人家招你惹你了。。会跟风说几句话是觉得自己特别牛掰了还是怎的。。。。。要是真的，还能让尔等平民说三道四？好好的听歌的地方，搞得乌烟瘴气。"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/tsSX1Td4ia6XroIb1CWPuw==/109951162809032743.jpg",
                "experts": null,
                "userId": 64813865,
                "userType": 0,
                "expertTags": null,
                "vipType": 10,
                "nickname": "却道天凉好个秋啊"
            },
            "beReplied": [],
            "likedCount": 754,
            "commentId": 33690853,
            "liked": false,
            "time": 1440853217676,
            "content": "天了噜 我竟开始单曲循环各种民歌"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/C_ktVaevARr3_Hy0GlrGyQ==/109951163026508525.jpg",
                "experts": null,
                "userId": 325425475,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "Jungle张"
            },
            "beReplied": [],
            "likedCount": 683,
            "commentId": 268445772,
            "liked": false,
            "time": 1482101523696,
            "content": "支持我们自己湘西的苗家妹子，你们知道我们那边能出这样的一个人才有多难吗？[心碎]\n她是古丈的，出名后给古丈修了好大好宽的路……"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/bFBmr_5N9KWrak86I6d9Eg==/109951163088305468.jpg",
                "experts": null,
                "userId": 65731368,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "克莉丝桃的越只"
            },
            "beReplied": [
                {
                    "user": {
                        "locationInfo": null,
                        "authStatus": 0,
                        "remarkName": null,
                        "avatarUrl": "http://p1.music.126.net/I95B22mDAyyoZCoTAzkpsQ==/3417282157905726.jpg",
                        "experts": null,
                        "userId": 29732993,
                        "userType": 0,
                        "expertTags": null,
                        "vipType": 0,
                        "nickname": "Hawern"
                    },
                    "content": "如果我说除了宋祖英，没有其他哪个女歌唱家能驾驭这首歌的磅礴气势。有人同意吗？",
                    "status": 0
                }
            ],
            "likedCount": 582,
            "commentId": 28256169,
            "liked": false,
            "time": 1437962651631,
            "content": "那不一定，张也、祖海也完全可以，甚至当今娘娘"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/Y7G1rpXE9K1xS9JP0J7-wA==/3234763211046218.jpg",
                "experts": null,
                "userId": 46554515,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "豪华丶"
            },
            "beReplied": [],
            "likedCount": 567,
            "commentId": 9223847,
            "liked": false,
            "time": 1421913040928,
            "content": "还以为不能听她的歌了。。"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/xAufwr3KZdPDUmwVx8OPAg==/3252355395608778.jpg",
                "experts": null,
                "userId": 90643474,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "梁删博住瀛台"
            },
            "beReplied": [],
            "likedCount": 534,
            "commentId": 193171341,
            "liked": false,
            "time": 1470221865840,
            "content": "宋唱歌还是很好听的，说她是当今中国艺术成就最高之一的歌手也不为过，湘西大山里的农村家庭走出来的，父母是农民，父亲早逝，弟弟是个聋哑人，而且热心国防和公益。但是被各种谣言抹黑，那些消息归根结底是21世纪初的法 lun 功为报复jiang的清洗传出来的，她一个普通的歌手承受了很多侮辱"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/b-Fx5JLF4Oy1tUYCzoYr5Q==/6665239488690452.jpg",
                "experts": null,
                "userId": 36969451,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "索尼子最有爱"
            },
            "beReplied": [],
            "likedCount": 501,
            "commentId": 22212357,
            "liked": false,
            "time": 1434347955830,
            "content": "喜欢听日文ACG的我不知道犯了什么神经去搜了这些，但是感觉好好听.貌似打开了新世界的大门(⊙o⊙)…[大哭]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/BYqmPO4Ig7CwsizfGiPqLw==/3412884111055422.jpg",
                "experts": null,
                "userId": 294929940,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "卡比巴尼亚的海"
            },
            "beReplied": [],
            "likedCount": 408,
            "commentId": 342796261,
            "liked": false,
            "time": 1490847699964,
            "content": "三月三快到了，我可能要请假回家唱山歌，没有我，我们村可能会输🌚"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "experts": null,
                "userId": 3385392,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "风中一个吻"
            },
            "beReplied": [],
            "likedCount": 396,
            "commentId": 42235731,
            "liked": false,
            "time": 1445546611647,
            "content": "我对宋映像好 因为她来我们县里义演过 本来\n\n是一首老百姓热情最后还加了两首歌 没什么架子"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "experts": null,
                "userId": 23502654,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "林枝"
            },
            "beReplied": [],
            "likedCount": 351,
            "commentId": 12065854,
            "liked": false,
            "time": 1425665924653,
            "content": "这声音听了好舒服[强]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/UBxpx6aFBhoI7H3p9h2Mhg==/18892908300470713.jpg",
                "experts": null,
                "userId": 39552270,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "gboing"
            },
            "beReplied": [
                {
                    "user": {
                        "locationInfo": null,
                        "authStatus": 0,
                        "remarkName": null,
                        "avatarUrl": "http://p1.music.126.net/Y7G1rpXE9K1xS9JP0J7-wA==/3234763211046218.jpg",
                        "experts": null,
                        "userId": 46554515,
                        "userType": 0,
                        "expertTags": null,
                        "vipType": 0,
                        "nickname": "豪华丶"
                    },
                    "content": "还以为不能听她的歌了。。",
                    "status": 0
                }
            ],
            "likedCount": 277,
            "commentId": 11392389,
            "liked": false,
            "time": 1424842587294,
            "content": "你的快递到了，开门"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/nShtapiVbhAUHCNYaiZS2w==/109951162858811864.jpg",
                "experts": null,
                "userId": 33890876,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "无印良痞"
            },
            "beReplied": [],
            "likedCount": 251,
            "commentId": 47773579,
            "liked": false,
            "time": 1447867043845,
            "content": "讨厌轻浮的调侃[哀伤]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/20H649ibIM-1lOZXO1WIZg==/19213965695861776.jpg",
                "experts": null,
                "userId": 252300482,
                "userType": 0,
                "expertTags": null,
                "vipType": 10,
                "nickname": "0giso_Setsuna"
            },
            "beReplied": [],
            "likedCount": 249,
            "commentId": 390961383,
            "liked": false,
            "time": 1495552652583,
            "content": "大地飞歌 简称 大哥 没毛病"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/iT84R17K5BNagp_fnF-cqA==/19036944323356895.jpg",
                "experts": null,
                "userId": 3228728,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "找自己恒miao"
            },
            "beReplied": [],
            "likedCount": 245,
            "commentId": 16216781,
            "liked": false,
            "time": 1429922175917,
            "content": "特别喜欢这种少民风情的歌曲，淳朴而美妙"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "experts": null,
                "userId": 110025411,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "端Echo"
            },
            "beReplied": [],
            "likedCount": 152,
            "commentId": 278872139,
            "liked": false,
            "time": 1483375621259,
            "content": "当年最开始听音乐时听的是民歌，后来渐渐开始听古典，纯音乐，流行，摇滚，爵士，布鲁斯，电子…啥都轮着听过后，偶然又听到民歌，被吸引来了。这声音实在太动听！有种阅尽沧桑回望最初的感觉。"
        }
    ],
    "code": 200,
    "comments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/ZIyCZeiVknO9FEZGsCOBTQ==/109951163013978416.jpg",
                "experts": null,
                "userId": 135061139,
                "userType": 0,
                "expertTags": null,
                "vipType": 0,
                "nickname": "刘大甜甜甜-"
            },
            "beReplied": [],
            "likedCount": 0,
            "commentId": 648041529,
            "liked": false,
            "time": 1513871156176,
            "content": "公司年会舞蹈就决定是这首歌了[呆]"
        }
    ],
    "total": 1707,
    "more": true
}
```

### 专辑评论

[http://116.196.87.226:3000/comment/album?id=28688&limit=1&offset=0](http://116.196.87.226:3000/comment/album?id=28688&limit=1&offset=0)

```
{
    "isMusician": false,
    "userId": 1317458286,
    "topComments": [],
    "moreHot": false,
    "hotComments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/eMVu5ba5H0IfHRzEaOU7gA==/3252355407270781.jpg",
                "experts": null,
                "vipType": 0,
                "userId": 31156604,
                "expertTags": null,
                "nickname": "旧单车老情歌",
                "userType": 0
            },
            "beReplied": [],
            "time": 1456488689991,
            "liked": false,
            "commentId": 123864968,
            "likedCount": 14,
            "content": "小时候每天的电视上都能看见基本法，好怀念了噜[憨笑]"
        }
    ],
    "code": 200,
    "comments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/8Uj73yiIIKfbK2oHApDG7Q==/1378787590326925.jpg",
                "experts": null,
                "vipType": 0,
                "userId": 114731387,
                "expertTags": null,
                "nickname": "柏拉图的囚徒",
                "userType": 0
            },
            "beReplied": [],
            "time": 1490263524323,
            "liked": false,
            "commentId": 337294686,
            "likedCount": 1,
            "content": "我买的第一张单人cd！！歌词翻烂[色]"
        }
    ],
    "total": 10,
    "more": true
}
```

### 歌单评论

[http://116.196.87.226:3000/comment/playlist?id=381180171&limit=1&offset=0](http://116.196.87.226:3000/comment/playlist?id=381180171&limit=1&offset=0)

```
{
    "isMusician": false,
    "userId": 1317458286,
    "topComments": [],
    "moreHot": false,
    "hotComments": [
        {
            "user": {
                "locationInfo": null,
                "expertTags": null,
                "vipType": 11,
                "nickname": "the-pope-gz",
                "userType": 4,
                "authStatus": 1,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/pWybyXTQ0mOBzDmZ6-wvqQ==/1417270498510650.jpg",
                "experts": null,
                "userId": 277434793
            },
            "beReplied": [],
            "time": 1500373236637,
            "liked": false,
            "commentId": 476020723,
            "likedCount": 40,
            "content": "看到鬼卞收藏了[惊恐]我想我是见了鬼了😂"
        },
        {
            "user": {
                "locationInfo": null,
                "expertTags": null,
                "vipType": 11,
                "nickname": "为风歌诵",
                "userType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/eLyl9AW7CdYznNjeItAqWw==/3412884109388153.jpg",
                "experts": null,
                "userId": 291637447
            },
            "beReplied": [],
            "time": 1503560053109,
            "liked": false,
            "commentId": 532009755,
            "likedCount": 11,
            "content": "神奇，鬼卞收藏了"
        }
    ],
    "code": 200,
    "comments": [
        {
            "user": {
                "locationInfo": null,
                "expertTags": null,
                "vipType": 0,
                "nickname": "地下88英里丶爬",
                "userType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/yD-fbqiWxVVdLy6YUpCOjQ==/19016053602865100.jpg",
                "experts": null,
                "userId": 137577852
            },
            "beReplied": [],
            "time": 1512467428965,
            "liked": false,
            "commentId": 633155518,
            "likedCount": 1,
            "content": "这个必须得收藏啊"
        }
    ],
    "total": 91,
    "more": true
}
```

### MV评论

[http://116.196.87.226:3000/comment/mv?id=5361298&limit=1&offset=0](http://116.196.87.226:3000/comment/mv?id=5361298&limit=1&offset=0)

```
{
    "isMusician": false,
    "userId": 1317458286,
    "topComments": [],
    "moreHot": false,
    "hotComments": [
        {
            "user": {
                "locationInfo": null,
                "userId": 117226731,
                "nickname": "Troi-",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/Stxjj9luMjs7-_BSxGkFpA==/3443670431309801.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 123,
            "commentId": 227210592,
            "liked": false,
            "time": 1476025465462,
            "content": "这种民歌的感染力确实不是流行歌能比的😂"
        },
        {
            "user": {
                "locationInfo": null,
                "userId": 11314119,
                "nickname": "wo就是小香倪",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/bov_h-DXkkidPPTaOtqENw==/19032546277029292.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 88,
            "commentId": 266599794,
            "liked": false,
            "time": 1481867939537,
            "content": "我看名字以为自己没听过，结果一开口发现我能唱到最后"
        },
        {
            "user": {
                "locationInfo": null,
                "userId": 11314119,
                "nickname": "wo就是小香倪",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/bov_h-DXkkidPPTaOtqENw==/19032546277029292.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 49,
            "commentId": 266546900,
            "liked": false,
            "time": 1481867908812,
            "content": "民歌的超有钱.这歌MV换了起码5套衣服~!都好看飘飘欲仙"
        },
        {
            "user": {
                "locationInfo": null,
                "userId": 68333660,
                "nickname": "Rapids",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/9vy9S0JDqSL2lfu8KTGSlA==/109951163086747074.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 40,
            "commentId": 276429165,
            "liked": false,
            "time": 1483102087543,
            "content": "我家有这张碟...我妈是宋祖英老师的小迷妹"
        },
        {
            "user": {
                "locationInfo": null,
                "userId": 34562901,
                "nickname": "秋之缘分已尽",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/IvCFWjUyuHtfCQHk2R3h5w==/1365593494855621.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 31,
            "commentId": 230602582,
            "liked": false,
            "time": 1476587453565,
            "content": "广西的南宁民歌艺术节之大地飞歌，以前还是很好看的[流泪]多久没看过了[流泪]"
        },
        {
            "user": {
                "locationInfo": null,
                "userId": 39032948,
                "nickname": "BabeWeAreOne",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/YjbT5S6ZrRaju64SWPDTBg==/3296335862964424.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [],
            "likedCount": 21,
            "commentId": 515463953,
            "liked": false,
            "time": 1503076625026,
            "content": "绝对的大投资 先不说造型这么多 这么多地点取景 散播歌词纸和群众学唱歌的画面还有大量特写画面到一朵云彩全部都有CG制作 就连那个玻璃舞台也是前卫的要命 布兰妮work bitch后来都用过"
        }
    ],
    "code": 200,
    "comments": [
        {
            "user": {
                "locationInfo": null,
                "userId": 536709145,
                "nickname": "潇洒的走93",
                "vipType": 0,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/QWfaVvVm22WjNFa5P--hnA==/18497084116049546.jpg",
                "experts": null,
                "userType": 0,
                "expertTags": null
            },
            "beReplied": [
                {
                    "user": {
                        "locationInfo": null,
                        "userId": 121152757,
                        "nickname": "AmyChen7",
                        "vipType": 0,
                        "authStatus": 0,
                        "remarkName": null,
                        "avatarUrl": "http://p1.music.126.net/NDtQTGFAGJIqaypkxXVqjQ==/18771962022781109.jpg",
                        "experts": null,
                        "userType": 0,
                        "expertTags": null
                    },
                    "content": "哈哈哈哈说得我好饿",
                    "status": 0
                }
            ],
            "likedCount": 0,
            "commentId": 645476273,
            "liked": false,
            "time": 1513613089356,
            "content": "吃货。真拿你没办法[流感]"
        }
    ],
    "total": 131,
    "more": true
}
```

### 电台节目评论

[http://116.196.87.226:3000/comment/dj?id=908984796&limit=1&offset=0](http://116.196.87.226:3000/comment/dj?id=908984796&limit=1&offset=0)

```
{
    "isMusician": false,
    "userId": 1317458286,
    "topComments": [],
    "moreHot": false,
    "hotComments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/i7-pZc8JrEy5tS3vXzQRDA==/19234856416630576.jpg",
                "experts": null,
                "vipType": 10,
                "nickname": "秃头火鸡",
                "userType": 0,
                "userId": 395542482,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534254454,
            "likedCount": 133,
            "time": 1503679508616,
            "content": "年纪轻轻喜欢什么村长呀，看，被hihi死了吧[大笑]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/xlbJGzoPNEqQI0_BBssNTQ==/18565253836848115.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "xusmok",
                "userType": 0,
                "userId": 444574983,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534210214,
            "likedCount": 109,
            "time": 1503677201619,
            "content": "hihihihihihihihihihhihihihihihihihi哈哈哈哈哈哈哈哈哈哈哈哈咳咳嘿嘿嘿嘿嘿嘿嘿嘻嘻嘻嘻嘻嘻嘻hihihihihihihihihihihihihihihihihihihi笑不动了歇会儿呼哈哈哈哈哈哈哈hihihihihihihihihihihihi"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/i9rTzJZiZ0hcdyyEiGM4Sw==/18564154325504352.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "RADWIMPSCharon",
                "userType": 0,
                "userId": 40480726,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534291213,
            "likedCount": 84,
            "time": 1503681826458,
            "content": "存下来当闹铃 会被笑醒[大哭]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/D7CXzQU7EgWdXvEbtG81Iw==/109951163039655951.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "你的登er",
                "userType": 0,
                "userId": 78471670,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534207309,
            "likedCount": 79,
            "time": 1503677176612,
            "content": "哈哈哈哈哈哈哈hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi 笑不动了救我hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi 咳咳咳咳hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi "
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/hufFJQsCIyrPIgA11Lr-qg==/18619129906795379.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "AGiMiD",
                "userType": 0,
                "userId": 70676598,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534274278,
            "likedCount": 67,
            "time": 1503680586173,
            "content": "那个人抽大麻，逮他，hihihi"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/MyEC_G-pQWBY0a_d1mlMJw==/109951162824835777.jpg",
                "experts": null,
                "vipType": 10,
                "nickname": "阿根廷五棵松",
                "userType": 0,
                "userId": 249237757,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534186711,
            "likedCount": 48,
            "time": 1503676756732,
            "content": "真当村长不用网易云吗[大哭]"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/M1iJimrvdsfoaoJ4tjzhzw==/18679603046859151.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "fa生生",
                "userType": 0,
                "userId": 376211468,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534216875,
            "likedCount": 43,
            "time": 1503678394322,
            "content": "满脑子的hihihihihi我睡不着了哈哈哈哈哈哈哈哈哈哈哈"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/jT-zJkp7KB9rU5EyG89rYA==/19240353974692407.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "摩卡-L",
                "userType": 0,
                "userId": 541092276,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 535958544,
            "likedCount": 41,
            "time": 1503802920234,
            "content": "以后看c菌的恐怖游戏合集拿这个在旁边放，hihihihihi"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/6bHFBPYro0xBHYVEex7D1g==/19053436997954077.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "Pi-nks",
                "userType": 0,
                "userId": 361933117,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534357310,
            "likedCount": 40,
            "time": 1503692077402,
            "content": "救命，我就这样跟着村长hihihihi了三分多钟，是我村长那笑不动了，还是你小饼干飘了，我先去hihihihi了\\(//∇//)\\"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/kjDna7BjkV7maV2hlTyMdw==/18969874114203715.jpg",
                "experts": null,
                "vipType": 11,
                "nickname": "安烁yo",
                "userType": 0,
                "userId": 293304302,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534481679,
            "likedCount": 39,
            "time": 1503711466504,
            "content": "真当村长不上网易云嘛！😂"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/8Pjbx3Lw76NubN8vrxR69w==/18727981557844435.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "汎小凡cz",
                "userType": 0,
                "userId": 499114292,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534513156,
            "likedCount": 38,
            "time": 1503712359777,
            "content": "hihi村:我还没笑完"
        },
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/oyW7ONIaU6QJJPNLFTsZqQ==/18807146395128415.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "白紫川00",
                "userType": 0,
                "userId": 400916130,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 534325967,
            "likedCount": 33,
            "time": 1503688612214,
            "content": "感觉村长都要笑不动了[大哭]笑不动了，快救我！[大哭]"
        }
    ],
    "code": 200,
    "comments": [
        {
            "user": {
                "locationInfo": null,
                "authStatus": 0,
                "remarkName": null,
                "avatarUrl": "http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg",
                "experts": null,
                "vipType": 0,
                "nickname": "我任何人都不是",
                "userType": 0,
                "userId": 1317458286,
                "expertTags": null
            },
            "beReplied": [],
            "liked": false,
            "commentId": 648416766,
            "likedCount": 0,
            "time": 1513920638766,
            "content": "日常思村"
        }
    ],
    "total": 109,
    "more": true
}
```

### 评论点赞

**不好使，以后排查**

[http://116.196.87.226:3000/comment/like?id=908984796&cid=648416766&t=1&type=4&t=1](http://116.196.87.226:3000/comment/like?id=908984796&cid=648416766&t=1&type=4&t=1)
