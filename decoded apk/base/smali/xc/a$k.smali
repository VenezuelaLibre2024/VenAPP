.class final Lxc/a$k;
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
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$k;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$k;

    invoke-direct {v0}, Lxc/a$k;-><init>()V

    sput-object v0, Lxc/a$k;->a:Lxc/a$k;

    const-string v0, "execution"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->b:Ljd/c;

    const-string v0, "customAttributes"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->c:Ljd/c;

    const-string v0, "internalKeys"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->d:Ljd/c;

    const-string v0, "background"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->e:Ljd/c;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->f:Ljd/c;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->g:Ljd/c;

    const-string v0, "uiOrientation"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$k;->h:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$a;Ljd/e;)V
    .locals 2

    sget-object v0, Lxc/a$k;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->f()Lxc/f0$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->d()Lxc/f0$e$d$a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$k;->h:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$k;->a(Lxc/f0$e$d$a;Ljd/e;)V

    return-void
.end method
