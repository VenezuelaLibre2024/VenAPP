.class final Lwd/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/b$b$b;,
        Lwd/b$b$a;,
        Lwd/b$b$d;,
        Lwd/b$b$c;
    }
.end annotation


# instance fields
.field private final a:Lwd/b$b;

.field private b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lqd/q;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/j;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/bumptech/glide/k;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/e;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/g;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/a;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/c;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lsd/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lxd/e;Lxd/c;Lwd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lwd/b$b;->a:Lwd/b$b;

    invoke-direct {p0, p1, p2, p3}, Lwd/b$b;->b(Lxd/e;Lxd/c;Lwd/f;)V

    return-void
.end method

.method synthetic constructor <init>(Lxd/e;Lxd/c;Lwd/f;Lwd/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwd/b$b;-><init>(Lxd/e;Lxd/c;Lwd/f;)V

    return-void
.end method

.method private b(Lxd/e;Lxd/c;Lwd/f;)V
    .locals 9

    invoke-static {p1}, Lxd/f;->a(Lxd/e;)Lxd/f;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->b:Lbk/a;

    new-instance p1, Lwd/b$b$c;

    invoke-direct {p1, p3}, Lwd/b$b$c;-><init>(Lwd/f;)V

    iput-object p1, p0, Lwd/b$b;->c:Lbk/a;

    new-instance p1, Lwd/b$b$d;

    invoke-direct {p1, p3}, Lwd/b$b$d;-><init>(Lwd/f;)V

    iput-object p1, p0, Lwd/b$b;->d:Lbk/a;

    invoke-static {}, Lud/k;->a()Lud/k;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->e:Lbk/a;

    iget-object v0, p0, Lwd/b$b;->d:Lbk/a;

    invoke-static {p2, v0, p1}, Lxd/d;->a(Lxd/c;Lbk/a;Lbk/a;)Lxd/d;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->f:Lbk/a;

    invoke-static {p1}, Lud/f;->a(Lbk/a;)Lud/f;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->g:Lbk/a;

    new-instance p1, Lwd/b$b$a;

    invoke-direct {p1, p3}, Lwd/b$b$a;-><init>(Lwd/f;)V

    iput-object p1, p0, Lwd/b$b;->h:Lbk/a;

    new-instance p1, Lwd/b$b$b;

    invoke-direct {p1, p3}, Lwd/b$b$b;-><init>(Lwd/f;)V

    iput-object p1, p0, Lwd/b$b;->i:Lbk/a;

    invoke-static {}, Lud/d;->a()Lud/d;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->j:Lbk/a;

    iget-object v0, p0, Lwd/b$b;->b:Lbk/a;

    iget-object v1, p0, Lwd/b$b;->c:Lbk/a;

    iget-object v2, p0, Lwd/b$b;->g:Lbk/a;

    invoke-static {}, Lud/o;->a()Lud/o;

    move-result-object v3

    invoke-static {}, Lud/o;->a()Lud/o;

    move-result-object v4

    iget-object v5, p0, Lwd/b$b;->h:Lbk/a;

    iget-object v6, p0, Lwd/b$b;->d:Lbk/a;

    iget-object v7, p0, Lwd/b$b;->i:Lbk/a;

    iget-object v8, p0, Lwd/b$b;->j:Lbk/a;

    invoke-static/range {v0 .. v8}, Lsd/d;->a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lsd/d;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/b$b;->k:Lbk/a;

    return-void
.end method


# virtual methods
.method public a()Lsd/b;
    .locals 1

    iget-object v0, p0, Lwd/b$b;->k:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsd/b;

    return-object v0
.end method
