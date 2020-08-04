package com.darkmili.mvvmtest.b_repository.bean;

import java.util.List;

public class MyCallBack {


    /**
     * result : {"realtime":{"visibility":8,"air_quality":{"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":7},"description":{"usa":"","chn":"优"},"co":0},"dswrf":46.3,"pressure":98365.22,"precipitation":{"nearest":{"intensity":6,"distance":0,"status":"ok"},"local":{"intensity":0.3125,"datasource":"radar","status":"ok"}},"cloudrate":1,"temperature":26.16,"skycon":"MODERATE_RAIN","humidity":1,"apparent_temperature":28,"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}},"status":"ok","wind":{"speed":18,"direction":270}},"primary":0}
     * server_time : 1596440464
     * unit : metric
     * timezone : Asia/Taipei
     * api_status : active
     * location : [25.1552,121.6544]
     * tzshift : 28800
     * api_version : v2.5
     * lang : zh_CN
     * status : ok
     */
    private ResultEntity result;
    private int server_time;
    private String unit;
    private String timezone;
    private String api_status;
    private List<Double> location;
    private int tzshift;
    private String api_version;
    private String lang;
    private String status;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getServer_time() {
        return server_time;
    }

    public String getUnit() {
        return unit;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getApi_status() {
        return api_status;
    }

    public List<Double> getLocation() {
        return location;
    }

    public int getTzshift() {
        return tzshift;
    }

    public String getApi_version() {
        return api_version;
    }

    public String getLang() {
        return lang;
    }

    public String getStatus() {
        return status;
    }

    public class ResultEntity {
        /**
         * realtime : {"visibility":8,"air_quality":{"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":7},"description":{"usa":"","chn":"优"},"co":0},"dswrf":46.3,"pressure":98365.22,"precipitation":{"nearest":{"intensity":6,"distance":0,"status":"ok"},"local":{"intensity":0.3125,"datasource":"radar","status":"ok"}},"cloudrate":1,"temperature":26.16,"skycon":"MODERATE_RAIN","humidity":1,"apparent_temperature":28,"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}},"status":"ok","wind":{"speed":18,"direction":270}}
         * primary : 0
         */
        private RealtimeEntity realtime;
        private int primary;

        public void setRealtime(RealtimeEntity realtime) {
            this.realtime = realtime;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public RealtimeEntity getRealtime() {
            return realtime;
        }

        public int getPrimary() {
            return primary;
        }

        public class RealtimeEntity {
            /**
             * visibility : 8.0
             * air_quality : {"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":7},"description":{"usa":"","chn":"优"},"co":0}
             * dswrf : 46.3
             * pressure : 98365.22
             * precipitation : {"nearest":{"intensity":6,"distance":0,"status":"ok"},"local":{"intensity":0.3125,"datasource":"radar","status":"ok"}}
             * cloudrate : 1.0
             * temperature : 26.16
             * skycon : MODERATE_RAIN
             * humidity : 1.0
             * apparent_temperature : 28.0
             * life_index : {"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}}
             * status : ok
             * wind : {"speed":18,"direction":270}
             */
            private double visibility;
            private Air_qualityEntity air_quality;
            private double dswrf;
            private double pressure;
            private PrecipitationEntity precipitation;
            private double cloudrate;
            private double temperature;
            private String skycon;
            private double humidity;
            private double apparent_temperature;
            private Life_indexEntity life_index;
            private String status;
            private WindEntity wind;

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public void setAir_quality(Air_qualityEntity air_quality) {
                this.air_quality = air_quality;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public void setPrecipitation(PrecipitationEntity precipitation) {
                this.precipitation = precipitation;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public void setApparent_temperature(double apparent_temperature) {
                this.apparent_temperature = apparent_temperature;
            }

            public void setLife_index(Life_indexEntity life_index) {
                this.life_index = life_index;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public void setWind(WindEntity wind) {
                this.wind = wind;
            }

            public double getVisibility() {
                return visibility;
            }

            public Air_qualityEntity getAir_quality() {
                return air_quality;
            }

            public double getDswrf() {
                return dswrf;
            }

            public double getPressure() {
                return pressure;
            }

            public PrecipitationEntity getPrecipitation() {
                return precipitation;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public double getTemperature() {
                return temperature;
            }

            public String getSkycon() {
                return skycon;
            }

            public double getHumidity() {
                return humidity;
            }

            public double getApparent_temperature() {
                return apparent_temperature;
            }

            public Life_indexEntity getLife_index() {
                return life_index;
            }

            public String getStatus() {
                return status;
            }

            public WindEntity getWind() {
                return wind;
            }

            public class Air_qualityEntity {
                /**
                 * no2 : 0
                 * pm25 : 3
                 * o3 : 0
                 * so2 : 0
                 * pm10 : 0
                 * aqi : {"usa":0,"chn":7}
                 * description : {"usa":"","chn":"优"}
                 * co : 0
                 */
                private int no2;
                private int pm25;
                private int o3;
                private int so2;
                private int pm10;
                private AqiEntity aqi;
                private DescriptionEntity description;
                private int co;

                public void setNo2(int no2) {
                    this.no2 = no2;
                }

                public void setPm25(int pm25) {
                    this.pm25 = pm25;
                }

                public void setO3(int o3) {
                    this.o3 = o3;
                }

                public void setSo2(int so2) {
                    this.so2 = so2;
                }

                public void setPm10(int pm10) {
                    this.pm10 = pm10;
                }

                public void setAqi(AqiEntity aqi) {
                    this.aqi = aqi;
                }

                public void setDescription(DescriptionEntity description) {
                    this.description = description;
                }

                public void setCo(int co) {
                    this.co = co;
                }

                public int getNo2() {
                    return no2;
                }

                public int getPm25() {
                    return pm25;
                }

                public int getO3() {
                    return o3;
                }

                public int getSo2() {
                    return so2;
                }

                public int getPm10() {
                    return pm10;
                }

                public AqiEntity getAqi() {
                    return aqi;
                }

                public DescriptionEntity getDescription() {
                    return description;
                }

                public int getCo() {
                    return co;
                }

                public class AqiEntity {
                    /**
                     * usa : 0
                     * chn : 7
                     */
                    private int usa;
                    private int chn;

                    public void setUsa(int usa) {
                        this.usa = usa;
                    }

                    public void setChn(int chn) {
                        this.chn = chn;
                    }

                    public int getUsa() {
                        return usa;
                    }

                    public int getChn() {
                        return chn;
                    }
                }

                public class DescriptionEntity {
                    /**
                     * usa :
                     * chn : 优
                     */
                    private String usa;
                    private String chn;

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

                    public String getUsa() {
                        return usa;
                    }

                    public String getChn() {
                        return chn;
                    }
                }
            }

            public class PrecipitationEntity {
                /**
                 * nearest : {"intensity":6,"distance":0,"status":"ok"}
                 * local : {"intensity":0.3125,"datasource":"radar","status":"ok"}
                 */
                private NearestEntity nearest;
                private LocalEntity local;

                public void setNearest(NearestEntity nearest) {
                    this.nearest = nearest;
                }

                public void setLocal(LocalEntity local) {
                    this.local = local;
                }

                public NearestEntity getNearest() {
                    return nearest;
                }

                public LocalEntity getLocal() {
                    return local;
                }

                public class NearestEntity {
                    /**
                     * intensity : 6.0
                     * distance : 0.0
                     * status : ok
                     */
                    private double intensity;
                    private double distance;
                    private String status;

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }

                    public void setDistance(double distance) {
                        this.distance = distance;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public double getDistance() {
                        return distance;
                    }

                    public String getStatus() {
                        return status;
                    }
                }

                public class LocalEntity {
                    /**
                     * intensity : 0.3125
                     * datasource : radar
                     * status : ok
                     */
                    private double intensity;
                    private String datasource;
                    private String status;

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public String getStatus() {
                        return status;
                    }
                }
            }

            public class Life_indexEntity {
                /**
                 * ultraviolet : {"index":2,"desc":"很弱"}
                 * comfort : {"index":4,"desc":"温暖"}
                 */
                private UltravioletEntity ultraviolet;
                private ComfortEntity comfort;

                public void setUltraviolet(UltravioletEntity ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public void setComfort(ComfortEntity comfort) {
                    this.comfort = comfort;
                }

                public UltravioletEntity getUltraviolet() {
                    return ultraviolet;
                }

                public ComfortEntity getComfort() {
                    return comfort;
                }

                public class UltravioletEntity {
                    /**
                     * index : 2.0
                     * desc : 很弱
                     */
                    private double index;
                    private String desc;

                    public void setIndex(double index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public double getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class ComfortEntity {
                    /**
                     * index : 4
                     * desc : 温暖
                     */
                    private int index;
                    private String desc;

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public int getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }
            }

            public class WindEntity {
                /**
                 * speed : 18.0
                 * direction : 270.0
                 */
                private double speed;
                private double direction;

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public double getSpeed() {
                    return speed;
                }

                public double getDirection() {
                    return direction;
                }
            }
        }
    }
}
