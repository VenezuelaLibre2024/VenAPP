.class final Lxc/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$i;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;

.field private static final i:Ljd/c;

.field private static final j:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$i;

    invoke-direct {v0}, Lxc/a$i;-><init>()V

    sput-object v0, Lxc/a$i;->a:Lxc/a$i;

    const-string v0, "arch"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->b:Ljd/c;

    const-string v0, "model"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->c:Ljd/c;

    const-string v0, "cores"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->d:Ljd/c;

    const-string v0, "ram"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->e:Ljd/c;

    const-string v0, "diskSpace"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->f:Ljd/c;

    const-string v0, "simulator"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->g:Ljd/c;

    const-string v0, "state"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->h:Ljd/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->i:Ljd/c;

    const-string v0, "modelClass"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$i;->j:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$c;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$i;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$i;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$i;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$i;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$i;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$i;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->j()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Z)Ljd/e;

    sget-object v0, Lxc/a$i;->h:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->i()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$i;->i:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$i;->j:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$c;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$i;->a(Lxc/f0$e$c;Ljd/e;)V

    return-void
.end method
