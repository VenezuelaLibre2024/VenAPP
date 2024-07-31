.class public Lcj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcj/d;

.field static final b:Lcj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcj/d;

    const-string v1, ""

    const-wide/high16 v2, -0x8000000000000000L

    invoke-direct {v0, v1, v2, v3}, Lcj/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcj/a;->a:Lcj/d;

    new-instance v0, Lcj/b;

    invoke-direct {v0, v2, v3}, Lcj/b;-><init>(J)V

    sput-object v0, Lcj/a;->b:Lcj/b;

    return-void
.end method

.method protected constructor <init>(Lcj/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcj/a;->a:Lcj/d;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "nope"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method protected a(Ljava/lang/String;J)Lcj/d;
    .locals 0

    sget-object p1, Lcj/a;->a:Lcj/d;

    return-object p1
.end method

.method protected b(Ljava/lang/String;Lcj/d;)V
    .locals 0

    return-void
.end method

.method protected c(Lcj/b;)V
    .locals 0

    return-void
.end method

.method protected d()Lcj/b;
    .locals 1

    sget-object v0, Lcj/a;->b:Lcj/b;

    return-object v0
.end method

.method protected e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected f(Ljava/lang/String;Lcj/d;)V
    .locals 0

    return-void
.end method

.method protected g(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected h(Ljava/lang/String;Lcj/d;)V
    .locals 0

    return-void
.end method
