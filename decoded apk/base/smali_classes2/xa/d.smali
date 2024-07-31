.class public final Lxa/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "Lcom/google/android/gms/common/api/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lxa/e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g<",
            "Lcom/google/android/gms/internal/safetynet/zzaf;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "Lcom/google/android/gms/internal/safetynet/zzaf;",
            "Lcom/google/android/gms/common/api/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/internal/safetynet/zzag;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lxa/d;->c:Lcom/google/android/gms/common/api/a$g;

    new-instance v1, Lxa/q;

    invoke-direct {v1}, Lxa/q;-><init>()V

    sput-object v1, Lxa/d;->d:Lcom/google/android/gms/common/api/a$a;

    new-instance v2, Lcom/google/android/gms/common/api/a;

    const-string v3, "SafetyNet.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v2, Lxa/d;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzae;

    invoke-direct {v0}, Lcom/google/android/gms/internal/safetynet/zzae;-><init>()V

    sput-object v0, Lxa/d;->b:Lxa/e;

    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzag;

    invoke-direct {v0}, Lcom/google/android/gms/internal/safetynet/zzag;-><init>()V

    sput-object v0, Lxa/d;->e:Lcom/google/android/gms/internal/safetynet/zzag;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lxa/f;
    .locals 1

    new-instance v0, Lxa/f;

    invoke-direct {v0, p0}, Lxa/f;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
