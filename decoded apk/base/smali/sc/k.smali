.class public Lsc/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lee/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/a<",
            "Lbf/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lee/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a<",
            "Lbf/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc/k;->a:Lee/a;

    return-void
.end method

.method public static synthetic a(Lsc/e;Lee/b;)V
    .locals 0

    invoke-static {p0, p1}, Lsc/k;->b(Lsc/e;Lee/b;)V

    return-void
.end method

.method private static synthetic b(Lsc/e;Lee/b;)V
    .locals 1

    invoke-interface {p1}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf/a;

    const-string v0, "firebase"

    invoke-interface {p1, v0, p0}, Lbf/a;->a(Ljava/lang/String;Lcf/f;)V

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p0

    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    invoke-virtual {p0, p1}, Lsc/g;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Lwc/n;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v0, "Didn\'t successfully register with UserMetadata for rollouts listener"

    invoke-virtual {p1, v0}, Lsc/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lsc/e;

    invoke-direct {v0, p1}, Lsc/e;-><init>(Lwc/n;)V

    iget-object p1, p0, Lsc/k;->a:Lee/a;

    new-instance v1, Lsc/j;

    invoke-direct {v1, v0}, Lsc/j;-><init>(Lsc/e;)V

    invoke-interface {p1, v1}, Lee/a;->a(Lee/a$a;)V

    return-void
.end method
