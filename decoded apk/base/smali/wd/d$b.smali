.class public final Lwd/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lxd/a;

.field private b:Lxd/g;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lwd/d$a;)V
    .locals 0

    invoke-direct {p0}, Lwd/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxd/a;)Lwd/d$b;
    .locals 0

    invoke-static {p1}, Ltd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxd/a;

    iput-object p1, p0, Lwd/d$b;->a:Lxd/a;

    return-object p0
.end method

.method public b()Lwd/f;
    .locals 4

    iget-object v0, p0, Lwd/d$b;->a:Lxd/a;

    const-class v1, Lxd/a;

    invoke-static {v0, v1}, Ltd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lwd/d$b;->b:Lxd/g;

    if-nez v0, :cond_0

    new-instance v0, Lxd/g;

    invoke-direct {v0}, Lxd/g;-><init>()V

    iput-object v0, p0, Lwd/d$b;->b:Lxd/g;

    :cond_0
    new-instance v0, Lwd/d$c;

    iget-object v1, p0, Lwd/d$b;->a:Lxd/a;

    iget-object v2, p0, Lwd/d$b;->b:Lxd/g;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lwd/d$c;-><init>(Lxd/a;Lxd/g;Lwd/d$a;)V

    return-object v0
.end method
