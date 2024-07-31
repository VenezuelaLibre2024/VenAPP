.class public final synthetic Ll9/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/zzdwa;


# direct methods
.method public synthetic constructor <init>(Ll9/c;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdwa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/d0;->a:Ll9/c;

    iput-object p2, p0, Ll9/d0;->b:Ljava/lang/String;

    iput-object p3, p0, Ll9/d0;->c:Ljava/lang/String;

    iput-object p4, p0, Ll9/d0;->d:Lcom/google/android/gms/internal/ads/zzdwa;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ll9/d0;->a:Ll9/c;

    iget-object v1, p0, Ll9/d0;->b:Ljava/lang/String;

    iget-object v2, p0, Ll9/d0;->c:Ljava/lang/String;

    iget-object v3, p0, Ll9/d0;->d:Lcom/google/android/gms/internal/ads/zzdwa;

    invoke-virtual {v0, v1, v2, v3}, Ll9/c;->r2(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdwa;)V

    return-void
.end method
