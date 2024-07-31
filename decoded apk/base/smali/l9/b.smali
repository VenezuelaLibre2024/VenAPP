.class public final synthetic Ll9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/v;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzdwa;

.field public final synthetic c:Ljava/util/ArrayDeque;

.field public final synthetic d:Ljava/util/ArrayDeque;


# direct methods
.method public synthetic constructor <init>(Ll9/v;Lcom/google/android/gms/internal/ads/zzdwa;Ljava/util/ArrayDeque;Ljava/util/ArrayDeque;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/b;->a:Ll9/v;

    iput-object p2, p0, Ll9/b;->b:Lcom/google/android/gms/internal/ads/zzdwa;

    iput-object p3, p0, Ll9/b;->c:Ljava/util/ArrayDeque;

    iput-object p4, p0, Ll9/b;->d:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ll9/b;->a:Ll9/v;

    iget-object v1, p0, Ll9/b;->b:Lcom/google/android/gms/internal/ads/zzdwa;

    iget-object v2, p0, Ll9/b;->c:Ljava/util/ArrayDeque;

    iget-object v3, p0, Ll9/b;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0, v1, v2, v3}, Ll9/v;->e(Lcom/google/android/gms/internal/ads/zzdwa;Ljava/util/ArrayDeque;Ljava/util/ArrayDeque;)V

    return-void
.end method
