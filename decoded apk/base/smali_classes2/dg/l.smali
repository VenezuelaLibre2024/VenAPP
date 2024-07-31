.class public final Ldg/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ldg/a;IILjava/util/Map;)Lkg/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ldg/a;",
            "II",
            "Ljava/util/Map<",
            "Ldg/g;",
            "*>;)",
            "Lkg/b;"
        }
    .end annotation

    sget-object v0, Ldg/l$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No encoder available for format "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance v0, Leg/c;

    invoke-direct {v0}, Leg/c;-><init>()V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lng/b;

    invoke-direct {v0}, Lng/b;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance v0, Ltg/b;

    invoke-direct {v0}, Ltg/b;-><init>()V

    goto :goto_0

    :pswitch_3
    new-instance v0, Lxg/d;

    invoke-direct {v0}, Lxg/d;-><init>()V

    goto :goto_0

    :pswitch_4
    new-instance v0, Ltg/o;

    invoke-direct {v0}, Ltg/o;-><init>()V

    goto :goto_0

    :pswitch_5
    new-instance v0, Ltg/d;

    invoke-direct {v0}, Ltg/d;-><init>()V

    goto :goto_0

    :pswitch_6
    new-instance v0, Ltg/h;

    invoke-direct {v0}, Ltg/h;-><init>()V

    goto :goto_0

    :pswitch_7
    new-instance v0, Ltg/f;

    invoke-direct {v0}, Ltg/f;-><init>()V

    goto :goto_0

    :pswitch_8
    new-instance v0, Lch/b;

    invoke-direct {v0}, Lch/b;-><init>()V

    goto :goto_0

    :pswitch_9
    new-instance v0, Ltg/u;

    invoke-direct {v0}, Ltg/u;-><init>()V

    goto :goto_0

    :pswitch_a
    new-instance v0, Ltg/j;

    invoke-direct {v0}, Ltg/j;-><init>()V

    goto :goto_0

    :pswitch_b
    new-instance v0, Ltg/b0;

    invoke-direct {v0}, Ltg/b0;-><init>()V

    goto :goto_0

    :pswitch_c
    new-instance v0, Ltg/l;

    invoke-direct {v0}, Ltg/l;-><init>()V

    :goto_0
    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Ldg/u;->a(Ljava/lang/String;Ldg/a;IILjava/util/Map;)Lkg/b;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
