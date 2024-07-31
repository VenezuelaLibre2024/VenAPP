.class final Lwc/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lwc/i;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lwc/a$a;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/a$a;

    invoke-direct {v0}, Lwc/a$a;-><init>()V

    sput-object v0, Lwc/a$a;->a:Lwc/a$a;

    const-string v0, "rolloutId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lwc/a$a;->b:Ljd/c;

    const-string v0, "parameterKey"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lwc/a$a;->c:Ljd/c;

    const-string v0, "parameterValue"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lwc/a$a;->d:Ljd/c;

    const-string v0, "variantId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lwc/a$a;->e:Ljd/c;

    const-string v0, "templateVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lwc/a$a;->f:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lwc/i;Ljd/e;)V
    .locals 3

    sget-object v0, Lwc/a$a;->b:Ljd/c;

    invoke-virtual {p1}, Lwc/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lwc/a$a;->c:Ljd/c;

    invoke-virtual {p1}, Lwc/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lwc/a$a;->d:Ljd/c;

    invoke-virtual {p1}, Lwc/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lwc/a$a;->e:Ljd/c;

    invoke-virtual {p1}, Lwc/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lwc/a$a;->f:Ljd/c;

    invoke-virtual {p1}, Lwc/i;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lwc/i;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lwc/a$a;->a(Lwc/i;Ljd/e;)V

    return-void
.end method
