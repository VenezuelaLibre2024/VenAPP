.class public final Lpf/g$b;
.super Laj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Laj/a<",
        "Lpf/g$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lvi/d;Lvi/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Laj/a;-><init>(Lvi/d;Lvi/c;)V

    return-void
.end method

.method synthetic constructor <init>(Lvi/d;Lvi/c;Lpf/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpf/g$b;-><init>(Lvi/d;Lvi/c;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lvi/d;Lvi/c;)Laj/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpf/g$b;->g(Lvi/d;Lvi/c;)Lpf/g$b;

    move-result-object p1

    return-object p1
.end method

.method protected g(Lvi/d;Lvi/c;)Lpf/g$b;
    .locals 1

    new-instance v0, Lpf/g$b;

    invoke-direct {v0, p1, p2}, Lpf/g$b;-><init>(Lvi/d;Lvi/c;)V

    return-object v0
.end method

.method public h(Lpf/d;)Lpf/e;
    .locals 3

    invoke-virtual {p0}, Laj/b;->c()Lvi/d;

    move-result-object v0

    invoke-static {}, Lpf/g;->a()Lvi/x0;

    move-result-object v1

    invoke-virtual {p0}, Laj/b;->b()Lvi/c;

    move-result-object v2

    invoke-static {v0, v1, v2, p1}, Laj/c;->b(Lvi/d;Lvi/x0;Lvi/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpf/e;

    return-object p1
.end method
