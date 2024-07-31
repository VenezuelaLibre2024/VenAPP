.class public final synthetic Loi/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Loi/u;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Loi/u;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/t;->a:Loi/u;

    iput-object p2, p0, Loi/t;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Loi/t;->a:Loi/u;

    iget-object v1, p0, Loi/t;->b:Ljava/util/List;

    invoke-static {v0, v1}, Loi/u$a;->a(Loi/u;Ljava/util/List;)V

    return-void
.end method
