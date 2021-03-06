val d1 = (1899,1,3);
val d2 = (1899,1,4);
val d3 = (1990,2,4);
val d4 = (1995,10,5);
	     (* 1 *)
	     is_older(d1,d2);

	     (* 2 *)
	     number_in_month([d1,d2,d3,d4],2);

	     (* 3 *)
	     number_in_months([d1,d2,d3,d4],[1,2]);
	     
	     (* 4 *)
	     dates_in_month([d1,d2,d3,d4],2);
	     
	     (* 5 *)
	     dates_in_months([d1,d2,d3,d4],[1,2]);

	     (* 6 *)
	     val s1 = "a";
	     val s2 = "b";
	     val s3 = "c";
	     val s4 = "d";
	     val s5 = "e";

	     (get_nth([s1,s2,s3,s4,s5], 3);

	      (* 7 *)
	      date_to_string(d1);

	      (* 8 *)
	      number_before_reaching_sum(3,[1,2,1,2,1]);

	      (* 9 *)
	      what_month(364);

	      (* 10 *)
	      month_range (31,330);

	      (* 11 *)
	      oldest ([d1,d2,d3]);
	      oldest ([]);
