.class public Lrb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljb/w<",
        "Lrb/g;",
        "Lrb/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lrb/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrb/h;

    invoke-direct {v0}, Lrb/h;-><init>()V

    sput-object v0, Lrb/h;->a:Lrb/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static d()V
    .locals 1

    sget-object v0, Lrb/h;->a:Lrb/h;

    invoke-static {v0}, Ljb/x;->n(Ljb/w;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljb/v;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/h;->e(Ljb/v;)Lrb/g;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lrb/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lrb/g;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lrb/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lrb/g;

    return-object v0
.end method

.method public e(Ljb/v;)Lrb/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Lrb/g;",
            ">;)",
            "Lrb/g;"
        }
    .end annotation

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljb/v;->e()Ljb/v$c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljb/v;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljb/v$c;

    invoke-virtual {v2}, Ljb/v$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrb/g;

    goto :goto_0

    :cond_1
    new-instance v0, Lrb/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lrb/h$b;-><init>(Ljb/v;Lrb/h$a;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "no primary in primitive set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "primitive set must be non-null"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
