.class public final Lwd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Lxd/e;

.field private b:Lxd/c;

.field private c:Lwd/f;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lwd/b$a;)V
    .locals 0

    invoke-direct {p0}, Lwd/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lwd/a;
    .locals 5

    iget-object v0, p0, Lwd/b$c;->a:Lxd/e;

    const-class v1, Lxd/e;

    invoke-static {v0, v1}, Ltd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lwd/b$c;->b:Lxd/c;

    if-nez v0, :cond_0

    new-instance v0, Lxd/c;

    invoke-direct {v0}, Lxd/c;-><init>()V

    iput-object v0, p0, Lwd/b$c;->b:Lxd/c;

    :cond_0
    iget-object v0, p0, Lwd/b$c;->c:Lwd/f;

    const-class v1, Lwd/f;

    invoke-static {v0, v1}, Ltd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lwd/b$b;

    iget-object v1, p0, Lwd/b$c;->a:Lxd/e;

    iget-object v2, p0, Lwd/b$c;->b:Lxd/c;

    iget-object v3, p0, Lwd/b$c;->c:Lwd/f;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lwd/b$b;-><init>(Lxd/e;Lxd/c;Lwd/f;Lwd/b$a;)V

    return-object v0
.end method

.method public b(Lxd/e;)Lwd/b$c;
    .locals 0

    invoke-static {p1}, Ltd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxd/e;

    iput-object p1, p0, Lwd/b$c;->a:Lxd/e;

    return-object p0
.end method

.method public c(Lwd/f;)Lwd/b$c;
    .locals 0

    invoke-static {p1}, Ltd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwd/f;

    iput-object p1, p0, Lwd/b$c;->c:Lwd/f;

    return-object p0
.end method
