.class public final Ls5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b$a;
    }
.end annotation


# static fields
.field public static final a:Ls5/b$a;

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ls5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls5/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ls5/b;->a:Ls5/b$a;

    const-string v2, "fetchPathProperties"

    const-string v3, "getAssetPathList"

    const-string v4, "getAssetListPaged"

    const-string v5, "getAssetListRange"

    const-string v6, "getAssetCount"

    const-string v7, "getAssetsByRange"

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls5/b;->b:[Ljava/lang/String;

    const-string v0, "getFullFile"

    const-string v1, "getOriginBytes"

    const-string v2, "getLatLngAndroidQ"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls5/b;->c:[Ljava/lang/String;

    return-void
.end method
