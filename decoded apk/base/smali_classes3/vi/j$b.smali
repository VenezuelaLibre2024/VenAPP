.class Lvi/j$b;
.super Lvi/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lvi/d;

.field private final b:Lvi/h;


# direct methods
.method private constructor <init>(Lvi/d;Lvi/h;)V
    .locals 0

    invoke-direct {p0}, Lvi/d;-><init>()V

    iput-object p1, p0, Lvi/j$b;->a:Lvi/d;

    const-string p1, "interceptor"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/h;

    iput-object p1, p0, Lvi/j$b;->b:Lvi/h;

    return-void
.end method

.method synthetic constructor <init>(Lvi/d;Lvi/h;Lvi/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lvi/j$b;-><init>(Lvi/d;Lvi/h;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/j$b;->a:Lvi/d;

    invoke-virtual {v0}, Lvi/d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lvi/j$b;->b:Lvi/h;

    iget-object v1, p0, Lvi/j$b;->a:Lvi/d;

    invoke-interface {v0, p1, p2, v1}, Lvi/h;->a(Lvi/x0;Lvi/c;Lvi/d;)Lvi/g;

    move-result-object p1

    return-object p1
.end method
