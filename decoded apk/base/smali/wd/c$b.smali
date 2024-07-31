.class public final Lwd/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lxd/q;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lwd/c$a;)V
    .locals 0

    invoke-direct {p0}, Lwd/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lwd/e;
    .locals 3

    iget-object v0, p0, Lwd/c$b;->a:Lxd/q;

    const-class v1, Lxd/q;

    invoke-static {v0, v1}, Ltd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lwd/c$c;

    iget-object v1, p0, Lwd/c$b;->a:Lxd/q;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwd/c$c;-><init>(Lxd/q;Lwd/c$a;)V

    return-object v0
.end method

.method public b(Lxd/q;)Lwd/c$b;
    .locals 0

    invoke-static {p1}, Ltd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxd/q;

    iput-object p1, p0, Lwd/c$b;->a:Lxd/q;

    return-object p0
.end method
