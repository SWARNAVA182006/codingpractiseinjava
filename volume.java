class volume{
public static void main(String[]args){
double radius_km=6378.0;//radius in km
double radius_miles=6378.0*1.6;//radius in miles as 1km=1.6 miles
double pi=3.14;//pi value
double volume_km=(4/3)*pi*radius_km*radius_km*radius_km;//calculating volume in cubic km
double volume_miles=(4/3)*pi*radius_miles*radius_miles*radius_miles;// calculating volume in cubic miles
System.out.println(" The volume of earth in cubic kilometers is "+volume_km+" and cubic miles is "+volume_miles);}
}