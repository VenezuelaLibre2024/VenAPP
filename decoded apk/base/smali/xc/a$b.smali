.class final Lxc/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$b;

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

    new-instance v0, Lxc/a$b;

    invoke-direct {v0}, Lxc/a$b;-><init>()V

    sput-object v0, Lxc/a$b;->a:Lxc/a$b;

    const-string v0, "pid"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->b:Ljd/c;

    const-string v0, "processName"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->c:Ljd/c;

    const-string v0, "reasonCode"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->d:Ljd/c;

    const-string v0, "importance"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->e:Ljd/c;

    const-string v0, "pss"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->f:Ljd/c;

    const-string v0, "rss"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->g:Ljd/c;

    const-string v0, "timestamp"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->h:Ljd/c;

    const-string v0, "traceFile"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->i:Ljd/c;

    const-string v0, "buildIdMappingForArch"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$b;->j:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$a;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$b;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$b;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$b;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$b;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$b;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$b;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$b;->h:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$b;->i:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$b;->j:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$b;->a(Lxc/f0$a;Ljd/e;)V

    return-void
.end method
