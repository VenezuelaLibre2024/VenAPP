.class final Lcf/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lcf/d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcf/a$a;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcf/a$a;

    invoke-direct {v0}, Lcf/a$a;-><init>()V

    sput-object v0, Lcf/a$a;->a:Lcf/a$a;

    const-string v0, "rolloutId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lcf/a$a;->b:Ljd/c;

    const-string v0, "variantId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lcf/a$a;->c:Ljd/c;

    const-string v0, "parameterKey"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lcf/a$a;->d:Ljd/c;

    const-string v0, "parameterValue"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lcf/a$a;->e:Ljd/c;

    const-string v0, "templateVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lcf/a$a;->f:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcf/d;Ljd/e;)V
    .locals 3

    sget-object v0, Lcf/a$a;->b:Ljd/c;

    invoke-virtual {p1}, Lcf/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcf/a$a;->c:Ljd/c;

    invoke-virtual {p1}, Lcf/d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcf/a$a;->d:Ljd/c;

    invoke-virtual {p1}, Lcf/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcf/a$a;->e:Ljd/c;

    invoke-virtual {p1}, Lcf/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcf/a$a;->f:Ljd/c;

    invoke-virtual {p1}, Lcf/d;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcf/d;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lcf/a$a;->a(Lcf/d;Ljd/e;)V

    return-void
.end method
