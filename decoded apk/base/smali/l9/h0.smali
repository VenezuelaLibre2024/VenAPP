.class public final synthetic Ll9/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic a:Ll9/c;


# direct methods
.method public synthetic constructor <init>(Ll9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/h0;->a:Ll9/c;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Ll9/h0;->a:Ll9/c;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Ll9/c;->R2(Ll9/c;Landroid/net/Uri;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
