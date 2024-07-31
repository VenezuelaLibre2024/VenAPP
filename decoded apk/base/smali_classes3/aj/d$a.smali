.class final Laj/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/d$a$a;
    }
.end annotation


# instance fields
.field private final a:Lvi/w0;


# direct methods
.method constructor <init>(Lvi/w0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "extraHeaders"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/w0;

    iput-object p1, p0, Laj/d$a;->a:Lvi/w0;

    return-void
.end method

.method static synthetic b(Laj/d$a;)Lvi/w0;
    .locals 0

    iget-object p0, p0, Laj/d$a;->a:Lvi/w0;

    return-object p0
.end method


# virtual methods
.method public a(Lvi/x0;Lvi/c;Lvi/d;)Lvi/g;
    .locals 1
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
            "Lvi/d;",
            ")",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    new-instance v0, Laj/d$a$a;

    invoke-virtual {p3, p1, p2}, Lvi/d;->h(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Laj/d$a$a;-><init>(Laj/d$a;Lvi/g;)V

    return-object v0
.end method
