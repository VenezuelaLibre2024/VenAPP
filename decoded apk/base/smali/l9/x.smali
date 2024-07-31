.class public final synthetic Ll9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/zzdwk;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzdwa;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:[Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/x;->a:Lcom/google/android/gms/internal/ads/zzdwk;

    iput-object p2, p0, Ll9/x;->b:Lcom/google/android/gms/internal/ads/zzdwa;

    iput-object p3, p0, Ll9/x;->c:Ljava/lang/String;

    iput-object p4, p0, Ll9/x;->d:[Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ll9/x;->a:Lcom/google/android/gms/internal/ads/zzdwk;

    iget-object v1, p0, Ll9/x;->b:Lcom/google/android/gms/internal/ads/zzdwa;

    iget-object v2, p0, Ll9/x;->c:Ljava/lang/String;

    iget-object v3, p0, Ll9/x;->d:[Landroid/util/Pair;

    invoke-static {v0, v1, v2, v3}, Ll9/y;->d(Lcom/google/android/gms/internal/ads/zzdwk;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/lang/String;[Landroid/util/Pair;)V

    return-void
.end method
