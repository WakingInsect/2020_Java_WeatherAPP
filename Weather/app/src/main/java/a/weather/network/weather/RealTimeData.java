package a.weather.network.weather;

//import java.util.List;

public class RealTimeData {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : 28800
     * timezone : Asia/Shanghai
     * server_time : 1605322561
     * location : [30.335165,112.239741]
     * result : {"realtime":{"status":"ok","temperature":17,"humidity":0.67,"cloudrate":0,"skycon":"CLEAR_DAY","visibility":17.97,"dswrf":339.9,"wind":{"speed":6.48,"direction":48},"pressure":102131.63,"apparent_temperature":16.4,"precipitation":{"local":{"status":"ok","datasource":"radar","doubleensity":0},"nearest":{"status":"ok","distance":10000,"doubleensity":0}},"air_quality":{"pm25":51,"pm10":136,"o3":55,"so2":10,"no2":50,"co":0.8,"aqi":{"chn":93,"usa":139},"description":{"chn":"良","usa":"轻度污染"}},"life_index":{"ultraviolet":{"index":7,"desc":"强"},"comfort":{"index":6,"desc":"凉爽"}}},"primary":0}
     */

    private String status;
//    private String api_version;
//    private String api_status;
//    private String lang;
//    private String unit;
//    private double tzshift;
//    private String timezone;
//    private double server_time;
    private ResultDTO result;
//    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getApi_version() {
//        return api_version;
//    }
//
//    public void setApi_version(String api_version) {
//        this.api_version = api_version;
//    }
//
//    public String getApi_status() {
//        return api_status;
//    }
//
//    public void setApi_status(String api_status) {
//        this.api_status = api_status;
//    }

//    public String getLang() {
//        return lang;
//    }
//
//    public void setLang(String lang) {
//        this.lang = lang;
//    }
//
//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
//
//    public double getTzshift() {
//        return tzshift;
//    }
//
//    public void setTzshift(double tzshift) {
//        this.tzshift = tzshift;
//    }
//
//    public String getTimezone() {
//        return timezone;
//    }
//
//    public void setTimezone(String timezone) {
//        this.timezone = timezone;
//    }
//
//    public double getServer_time() {
//        return server_time;
//    }
//
//    public void setServer_time(double server_time) {
//        this.server_time = server_time;
//    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

//    public List<Double> getLocation() {
//        return location;
//    }
//
//    public void setLocation(List<Double> location) {
//        this.location = location;
//    }

    public static class ResultDTO {
        /**
         * realtime : {"status":"ok","temperature":17,"humidity":0.67,"cloudrate":0,"skycon":"CLEAR_DAY","visibility":17.97,"dswrf":339.9,"wind":{"speed":6.48,"direction":48},"pressure":102131.63,"apparent_temperature":16.4,"precipitation":{"local":{"status":"ok","datasource":"radar","doubleensity":0},"nearest":{"status":"ok","distance":10000,"doubleensity":0}},"air_quality":{"pm25":51,"pm10":136,"o3":55,"so2":10,"no2":50,"co":0.8,"aqi":{"chn":93,"usa":139},"description":{"chn":"良","usa":"轻度污染"}},"life_index":{"ultraviolet":{"index":7,"desc":"强"},"comfort":{"index":6,"desc":"凉爽"}}}
         * primary : 0
         */

        private RealtimeDTO realtime;
//        private double primary;

        public RealtimeDTO getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeDTO realtime) {
            this.realtime = realtime;
        }

//        public double getPrimary() {
//            return primary;
//        }
//
//        public void setPrimary(double primary) {
//            this.primary = primary;
//        }

        public static class RealtimeDTO {
            /**
             * status : ok
             * temperature : 17
             * humidity : 0.67
             * cloudrate : 0
             * skycon : CLEAR_DAY
             * visibility : 17.97
             * dswrf : 339.9
             * wind : {"speed":6.48,"direction":48}
             * pressure : 102131.63
             * apparent_temperature : 16.4
             * precipitation : {"local":{"status":"ok","datasource":"radar","doubleensity":0},"nearest":{"status":"ok","distance":10000,"doubleensity":0}}
             * air_quality : {"pm25":51,"pm10":136,"o3":55,"so2":10,"no2":50,"co":0.8,"aqi":{"chn":93,"usa":139},"description":{"chn":"良","usa":"轻度污染"}}
             * life_index : {"ultraviolet":{"index":7,"desc":"强"},"comfort":{"index":6,"desc":"凉爽"}}
             */

//            private String status;
            private double temperature;
//            private double humidity;
//            private double cloudrate;
            private String skycon;
//            private double visibility;
//            private double dswrf;
//            private WindDTO wind;
//            private double pressure;
//            private double apparent_temperature;
//            private PrecipitationDTO precipitation;
            private AirQualityDTO air_quality;
//            private LifeIndexDTO life_index;

//            public String getStatus() {
//                return status;
//            }
//
//            public void setStatus(String status) {
//                this.status = status;
//            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

//            public double getHumidity() {
//                return humidity;
//            }
//
//            public void setHumidity(double humidity) {
//                this.humidity = humidity;
//            }
//
//            public double getCloudrate() {
//                return cloudrate;
//            }
//
//            public void setCloudrate(double cloudrate) {
//                this.cloudrate = cloudrate;
//            }

            public String getSkycon() {
                return skycon;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

//            public double getVisibility() {
//                return visibility;
//            }
//
//            public void setVisibility(double visibility) {
//                this.visibility = visibility;
//            }

//            public double getDswrf() {
//                return dswrf;
//            }
//
//            public void setDswrf(double dswrf) {
//                this.dswrf = dswrf;
//            }
//
//            public WindDTO getWind() {
//                return wind;
//            }
//
//            public void setWind(WindDTO wind) {
//                this.wind = wind;
//            }
//
//            public double getPressure() {
//                return pressure;
//            }
//
//            public void setPressure(double pressure) {
//                this.pressure = pressure;
//            }
//
//            public double getApparent_temperature() {
//                return apparent_temperature;
//            }
//
//            public void setApparent_temperature(double apparent_temperature) {
//                this.apparent_temperature = apparent_temperature;
//            }
//
//            public PrecipitationDTO getPrecipitation() {
//                return precipitation;
//            }
//
//            public void setPrecipitation(PrecipitationDTO precipitation) {
//                this.precipitation = precipitation;
//            }

            public AirQualityDTO getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityDTO air_quality) {
                this.air_quality = air_quality;
            }

//            public LifeIndexDTO getLife_index() {
//                return life_index;
//            }

//            public void setLife_index(LifeIndexDTO life_index) {
//                this.life_index = life_index;
//            }

//            public static class WindDTO {
//                /**
//                 * speed : 6.48
//                 * direction : 48
//                 */
//
//                private double speed;
//                private double direction;
//
//                public double getSpeed() {
//                    return speed;
//                }
//
//                public void setSpeed(double speed) {
//                    this.speed = speed;
//                }
//
//                public double getDirection() {
//                    return direction;
//                }
//
//                public void setDirection(double direction) {
//                    this.direction = direction;
//                }
//            }

//            public static class PrecipitationDTO {
//                /**
//                 * local : {"status":"ok","datasource":"radar","doubleensity":0}
//                 * nearest : {"status":"ok","distance":10000,"doubleensity":0}
//                 */
//
//                private LocalDTO local;
//                private NearestDTO nearest;
//
//                public LocalDTO getLocal() {
//                    return local;
//                }
//
//                public void setLocal(LocalDTO local) {
//                    this.local = local;
//                }
//
//                public NearestDTO getNearest() {
//                    return nearest;
//                }
//
//                public void setNearest(NearestDTO nearest) {
//                    this.nearest = nearest;
//                }
//
//                public static class LocalDTO {
//                    /**
//                     * status : ok
//                     * datasource : radar
//                     * doubleensity : 0
//                     */
//
//                    private String status;
//                    private String datasource;
//                    private double doubleensity;
//
//                    public String getStatus() {
//                        return status;
//                    }
//
//                    public void setStatus(String status) {
//                        this.status = status;
//                    }
//
//                    public String getDatasource() {
//                        return datasource;
//                    }
//
//                    public void setDatasource(String datasource) {
//                        this.datasource = datasource;
//                    }
//
//                    public double getdoubleensity() {
//                        return doubleensity;
//                    }
//
//                    public void setdoubleensity(double doubleensity) {
//                        this.doubleensity = doubleensity;
//                    }
//                }
//
//                public static class NearestDTO {
//                    /**
//                     * status : ok
//                     * distance : 10000
//                     * doubleensity : 0
//                     */
//
//                    private String status;
//                    private double distance;
//                    private double doubleensity;
//
//                    public String getStatus() {
//                        return status;
//                    }
//
//                    public void setStatus(String status) {
//                        this.status = status;
//                    }
//
//                    public double getDistance() {
//                        return distance;
//                    }
//
//                    public void setDistance(double distance) {
//                        this.distance = distance;
//                    }
//
//                    public double getdoubleensity() {
//                        return doubleensity;
//                    }
//
//                    public void setdoubleensity(double doubleensity) {
//                        this.doubleensity = doubleensity;
//                    }
//                }
//            }

            public static class AirQualityDTO {
                /**
                 * pm25 : 51
                 * pm10 : 136
                 * o3 : 55
                 * so2 : 10
                 * no2 : 50
                 * co : 0.8
                 * aqi : {"chn":93,"usa":139}
                 * description : {"chn":"良","usa":"轻度污染"}
                 */

//                private double pm25;
//                private double pm10;
//                private double o3;
//                private double so2;
//                private double no2;
//                private double co;
//                private AqiDTO aqi;
                private DescriptionDTO description;

//                public double getPm25() {
//                    return pm25;
//                }
//
//                public void setPm25(double pm25) {
//                    this.pm25 = pm25;
//                }
//
//                public double getPm10() {
//                    return pm10;
//                }
//
//                public void setPm10(double pm10) {
//                    this.pm10 = pm10;
//                }
//
//                public double getO3() {
//                    return o3;
//                }
//
//                public void setO3(double o3) {
//                    this.o3 = o3;
//                }
//
//                public double getSo2() {
//                    return so2;
//                }
//
//                public void setSo2(double so2) {
//                    this.so2 = so2;
//                }
//
//                public double getNo2() {
//                    return no2;
//                }
//
//                public void setNo2(double no2) {
//                    this.no2 = no2;
//                }
//
//                public double getCo() {
//                    return co;
//                }
//
//                public void setCo(double co) {
//                    this.co = co;
//                }
//
//                public AqiDTO getAqi() {
//                    return aqi;
//                }
//
//                public void setAqi(AqiDTO aqi) {
//                    this.aqi = aqi;
//                }

                public DescriptionDTO getDescription() {
                    return description;
                }

                public void setDescription(DescriptionDTO description) {
                    this.description = description;
                }

//                public static class AqiDTO {
//                    /**
//                     * chn : 93
//                     * usa : 139
//                     */
//
//                    private double chn;
//                    private double usa;
//
//                    public double getChn() {
//                        return chn;
//                    }
//
//                    public void setChn(double chn) {
//                        this.chn = chn;
//                    }
//
//                    public double getUsa() {
//                        return usa;
//                    }
//
//                    public void setUsa(double usa) {
//                        this.usa = usa;
//                    }
//                }

                public static class DescriptionDTO {
                    /**
                     * chn : 良
                     * usa : 轻度污染
                     */

                    private String chn;
//                    private String usa;

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

//                    public String getUsa() {
//                        return usa;
//                    }
//
//                    public void setUsa(String usa) {
//                        this.usa = usa;
//                    }
                }
            }

//            public static class LifeIndexDTO {
//                /**
//                 * ultraviolet : {"index":7,"desc":"强"}
//                 * comfort : {"index":6,"desc":"凉爽"}
//                 */
//
//                private UltravioletDTO ultraviolet;
//                private ComfortDTO comfort;
//
//                public UltravioletDTO getUltraviolet() {
//                    return ultraviolet;
//                }
//
//                public void setUltraviolet(UltravioletDTO ultraviolet) {
//                    this.ultraviolet = ultraviolet;
//                }
//
//                public ComfortDTO getComfort() {
//                    return comfort;
//                }
//
//                public void setComfort(ComfortDTO comfort) {
//                    this.comfort = comfort;
//                }
//
//                public static class UltravioletDTO {
//                    /**
//                     * index : 7
//                     * desc : 强
//                     */
//
//                    private double index;
//                    private String desc;
//
//                    public double getIndex() {
//                        return index;
//                    }
//
//                    public void setIndex(double index) {
//                        this.index = index;
//                    }
//
//                    public String getDesc() {
//                        return desc;
//                    }
//
//                    public void setDesc(String desc) {
//                        this.desc = desc;
//                    }
//                }
//
//                public static class ComfortDTO {
//                    /**
//                     * index : 6
//                     * desc : 凉爽
//                     */
//
//                    private double index;
//                    private String desc;
//
//                    public double getIndex() {
//                        return index;
//                    }
//
//                    public void setIndex(double index) {
//                        this.index = index;
//                    }
//
//                    public String getDesc() {
//                        return desc;
//                    }
//
//                    public void setDesc(String desc) {
//                        this.desc = desc;
//                    }
//                }
//            }
        }
    }
}
