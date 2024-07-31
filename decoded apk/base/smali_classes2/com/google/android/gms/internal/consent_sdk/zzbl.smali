.class public final synthetic Lcom/google/android/gms/internal/consent_sdk/zzbl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/f$b;


# instance fields
.field public final synthetic zza:Landroid/app/Activity;

.field public final synthetic zzb:Lcb/b$a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcb/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbl;->zza:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzbl;->zzb:Lcb/b$a;

    return-void
.end method


# virtual methods
.method public final onConsentFormLoadSuccess(Lcb/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzbl;->zza:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbl;->zzb:Lcb/b$a;

    invoke-interface {p1, v0, v1}, Lcb/b;->show(Landroid/app/Activity;Lcb/b$a;)V

    return-void
.end method
