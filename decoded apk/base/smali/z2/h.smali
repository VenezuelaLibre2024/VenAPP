.class public final synthetic Lz2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Ly2/a;


# direct methods
.method public synthetic constructor <init>(Ly2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/h;->a:Ly2/a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lz2/h;->a:Ly2/a;

    invoke-static {v0, p1}, Lz2/k;->i(Ly2/a;Ljava/lang/Exception;)V

    return-void
.end method
