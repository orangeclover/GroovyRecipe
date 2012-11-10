tab2space="""aaaa
\tbbb
cccc\tddddd
	eeeeee
fffffff\t
gggggggg	
"""


space2tab="""aaaa
        bbb
ccccc         ddddd
    eeeeee
fffff       
gggggggg        
"""

println tab2space.expand()
println tab2space.expand(4)

println space2tab.unexpand()
println space2tab.unexpand(4)




test = """\
a
 b
c
    d
        e
\tf
			g
"""

println test
println test.expand()
println test.expand().unexpand()