.class final Lwd/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwd/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lxd/g;

.field private final b:Lwd/d$c;

.field private c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/g;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/util/DisplayMetrics;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lxd/a;Lxd/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lwd/d$c;->b:Lwd/d$c;

    iput-object p2, p0, Lwd/d$c;->a:Lxd/g;

    invoke-direct {p0, p1, p2}, Lwd/d$c;->e(Lxd/a;Lxd/g;)V

    return-void
.end method

.method synthetic constructor <init>(Lxd/a;Lxd/g;Lwd/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwd/d$c;-><init>(Lxd/a;Lxd/g;)V

    return-void
.end method

.method private e(Lxd/a;Lxd/g;)V
    .locals 0

    invoke-static {p1}, Lxd/b;->a(Lxd/a;)Lxd/b;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->c:Lbk/a;

    invoke-static {}, Lud/h;->a()Lud/h;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->d:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->c:Lbk/a;

    invoke-static {p1}, Lud/b;->a(Lbk/a;)Lud/b;

    move-result-object p1

    invoke-static {p1}, Ltd/b;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->e:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->c:Lbk/a;

    invoke-static {p2, p1}, Lxd/l;->a(Lxd/g;Lbk/a;)Lxd/l;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/p;->a(Lxd/g;Lbk/a;)Lxd/p;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->g:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/m;->a(Lxd/g;Lbk/a;)Lxd/m;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->h:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/n;->a(Lxd/g;Lbk/a;)Lxd/n;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->i:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/o;->a(Lxd/g;Lbk/a;)Lxd/o;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->j:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/j;->a(Lxd/g;Lbk/a;)Lxd/j;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->k:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/k;->a(Lxd/g;Lbk/a;)Lxd/k;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->l:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/i;->a(Lxd/g;Lbk/a;)Lxd/i;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->m:Lbk/a;

    iget-object p1, p0, Lwd/d$c;->f:Lbk/a;

    invoke-static {p2, p1}, Lxd/h;->a(Lxd/g;Lbk/a;)Lxd/h;

    move-result-object p1

    iput-object p1, p0, Lwd/d$c;->n:Lbk/a;

    return-void
.end method


# virtual methods
.method public a()Lud/g;
    .locals 1

    iget-object v0, p0, Lwd/d$c;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud/g;

    return-object v0
.end method

.method public b()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lwd/d$c;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    return-object v0
.end method

.method public c()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-static {v0}, Ltd/c;->b(I)Ltd/c;

    move-result-object v0

    const-string v1, "IMAGE_ONLY_PORTRAIT"

    iget-object v2, p0, Lwd/d$c;->g:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "IMAGE_ONLY_LANDSCAPE"

    iget-object v2, p0, Lwd/d$c;->h:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "MODAL_LANDSCAPE"

    iget-object v2, p0, Lwd/d$c;->i:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "MODAL_PORTRAIT"

    iget-object v2, p0, Lwd/d$c;->j:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "CARD_LANDSCAPE"

    iget-object v2, p0, Lwd/d$c;->k:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "CARD_PORTRAIT"

    iget-object v2, p0, Lwd/d$c;->l:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "BANNER_PORTRAIT"

    iget-object v2, p0, Lwd/d$c;->m:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    const-string v1, "BANNER_LANDSCAPE"

    iget-object v2, p0, Lwd/d$c;->n:Lbk/a;

    invoke-virtual {v0, v1, v2}, Ltd/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ltd/c;

    move-result-object v0

    invoke-virtual {v0}, Ltd/c;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public d()Lud/a;
    .locals 1

    iget-object v0, p0, Lwd/d$c;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud/a;

    return-object v0
.end method
