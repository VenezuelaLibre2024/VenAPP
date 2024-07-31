.class public final synthetic Ll9/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# static fields
.field public static final synthetic a:Ll9/k0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll9/k0;

    invoke-direct {v0}, Ll9/k0;-><init>()V

    sput-object v0, Ll9/k0;->a:Ll9/k0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 0

    check-cast p1, Ll9/a0;

    invoke-virtual {p1}, Ll9/a0;->zzc()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
