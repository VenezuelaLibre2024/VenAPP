.class public final Lcom/google/android/recaptcha/internal/zzbc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/webkit/WebView;

.field private final zzb:Lzk/k0;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lzk/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbc;->zza:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzbc;->zzb:Lzk/k0;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzbc;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzbc;->zza:Landroid/webkit/WebView;

    return-object p0
.end method


# virtual methods
.method public final varargs zzb(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbc;->zzb:Lzk/k0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/google/android/recaptcha/internal/zzbb;

    const/4 v4, 0x0

    invoke-direct {v3, p2, p0, p1, v4}, Lcom/google/android/recaptcha/internal/zzbb;-><init>([Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbc;Ljava/lang/String;Lgk/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    return-void
.end method
