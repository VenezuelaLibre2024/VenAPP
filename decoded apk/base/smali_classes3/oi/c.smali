.class public final synthetic Loi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Loi/d;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Loi/d;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/c;->a:Loi/d;

    iput-object p2, p0, Loi/c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Loi/c;->a:Loi/d;

    iget-object v1, p0, Loi/c;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Loi/d;->a(Loi/d;Ljava/util/Map;)V

    return-void
.end method
