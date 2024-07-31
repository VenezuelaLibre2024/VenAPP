.class final Lxc/a$y;
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
    name = "y"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$y;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$y;

    invoke-direct {v0}, Lxc/a$y;-><init>()V

    sput-object v0, Lxc/a$y;->a:Lxc/a$y;

    const-string v0, "platform"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$y;->b:Ljd/c;

    const-string v0, "version"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$y;->c:Ljd/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$y;->d:Ljd/c;

    const-string v0, "jailbroken"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$y;->e:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$e;Ljd/e;)V
    .locals 2

    sget-object v0, Lxc/a$y;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$e;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$y;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$y;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$y;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$e;->e()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Z)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$e;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$y;->a(Lxc/f0$e$e;Ljd/e;)V

    return-void
.end method
