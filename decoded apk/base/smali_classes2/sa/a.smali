.class public final Lsa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/dynamic/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/dynamic/b;

    iput-object p1, p0, Lsa/a;->a:Lcom/google/android/gms/dynamic/b;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/dynamic/b;
    .locals 1

    iget-object v0, p0, Lsa/a;->a:Lcom/google/android/gms/dynamic/b;

    return-object v0
.end method
