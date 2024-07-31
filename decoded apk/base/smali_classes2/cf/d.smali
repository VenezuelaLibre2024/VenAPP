.class public abstract Lcf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/d$a;
    }
.end annotation


# static fields
.field public static final a:Ljd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lld/d;

    invoke-direct {v0}, Lld/d;-><init>()V

    sget-object v1, Lcf/a;->a:Lkd/a;

    invoke-virtual {v0, v1}, Lld/d;->i(Lkd/a;)Lld/d;

    move-result-object v0

    invoke-virtual {v0}, Lld/d;->h()Ljd/a;

    move-result-object v0

    sput-object v0, Lcf/d;->a:Ljd/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcf/d$a;
    .locals 1

    new-instance v0, Lcf/b$b;

    invoke-direct {v0}, Lcf/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()J
.end method

.method public abstract f()Ljava/lang/String;
.end method
