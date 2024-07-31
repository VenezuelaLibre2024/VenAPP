.class final Lxc/a$s;
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
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$s;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$s;

    invoke-direct {v0}, Lxc/a$s;-><init>()V

    sput-object v0, Lxc/a$s;->a:Lxc/a$s;

    const-string v0, "batteryLevel"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->b:Ljd/c;

    const-string v0, "batteryVelocity"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->c:Ljd/c;

    const-string v0, "proximityOn"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->d:Ljd/c;

    const-string v0, "orientation"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->e:Ljd/c;

    const-string v0, "ramUsed"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->f:Ljd/c;

    const-string v0, "diskUsed"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$s;->g:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$c;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$s;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->b()Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$s;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$s;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->g()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Z)Ljd/e;

    sget-object v0, Lxc/a$s;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->e()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$s;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$s;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$c;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$s;->a(Lxc/f0$e$d$c;Ljd/e;)V

    return-void
.end method
