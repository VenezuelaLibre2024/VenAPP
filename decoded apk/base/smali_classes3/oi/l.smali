.class public final synthetic Loi/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Loi/s;


# direct methods
.method public synthetic constructor <init>(Loi/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/l;->a:Loi/s;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Loi/l;->a:Loi/s;

    invoke-static {v0, p1}, Loi/s;->l(Loi/s;Ljava/lang/Exception;)V

    return-void
.end method
