.class final Lxc/a$j;
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
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$j;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;

.field private static final i:Ljd/c;

.field private static final j:Ljd/c;

.field private static final k:Ljd/c;

.field private static final l:Ljd/c;

.field private static final m:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$j;

    invoke-direct {v0}, Lxc/a$j;-><init>()V

    sput-object v0, Lxc/a$j;->a:Lxc/a$j;

    const-string v0, "generator"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->b:Ljd/c;

    const-string v0, "identifier"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->c:Ljd/c;

    const-string v0, "appQualitySessionId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->d:Ljd/c;

    const-string v0, "startedAt"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->e:Ljd/c;

    const-string v0, "endedAt"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->f:Ljd/c;

    const-string v0, "crashed"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->g:Ljd/c;

    const-string v0, "app"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->h:Ljd/c;

    const-string v0, "user"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->i:Ljd/c;

    const-string v0, "os"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->j:Ljd/c;

    const-string v0, "device"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->k:Ljd/c;

    const-string v0, "events"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->l:Ljd/c;

    const-string v0, "generatorType"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$j;->m:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$j;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->j()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$j;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->n()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Z)Ljd/e;

    sget-object v0, Lxc/a$j;->h:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->b()Lxc/f0$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->i:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->m()Lxc/f0$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->j:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->k()Lxc/f0$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->k:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->d()Lxc/f0$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->l:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$j;->m:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$j;->a(Lxc/f0$e;Ljd/e;)V

    return-void
.end method
