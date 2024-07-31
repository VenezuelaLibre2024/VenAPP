.class final Lsa/t;
.super Lta/y;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$l;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$l;)V
    .locals 0

    iput-object p2, p0, Lsa/t;->a:Lsa/c$l;

    invoke-direct {p0}, Lta/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final Q0(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lsa/t;->a:Lsa/c$l;

    invoke-interface {v0, p1}, Lsa/c$l;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/dynamic/b;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object v0, p0, Lsa/t;->a:Lsa/c$l;

    invoke-interface {v0, p1}, Lsa/c$l;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    return-void
.end method
