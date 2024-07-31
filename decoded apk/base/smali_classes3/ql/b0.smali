.class public abstract Lql/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/b0$a;
    }
.end annotation


# static fields
.field public static final a:Lql/b0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lql/b0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/b0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/b0;->a:Lql/b0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Ljava/io/File;Lql/w;)Lql/b0;
    .locals 1

    sget-object v0, Lql/b0;->a:Lql/b0$a;

    invoke-virtual {v0, p0, p1}, Lql/b0$a;->a(Ljava/io/File;Lql/w;)Lql/b0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Lql/w;
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract f(Ldm/c;)V
.end method
