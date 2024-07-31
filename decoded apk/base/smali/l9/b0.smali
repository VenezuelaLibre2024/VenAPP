.class public final synthetic Ll9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdt;


# instance fields
.field public final synthetic a:Ll9/c;


# direct methods
.method public synthetic constructor <init>(Ll9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/b0;->a:Ll9/c;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Ll9/b0;->a:Ll9/c;

    invoke-virtual {v0}, Ll9/c;->S2()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
