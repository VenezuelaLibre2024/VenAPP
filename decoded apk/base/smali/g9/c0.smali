.class public final synthetic Lg9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg9/e0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lg9/e0;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/c0;->a:Lg9/e0;

    iput-object p2, p0, Lg9/c0;->b:Ljava/lang/String;

    iput-object p3, p0, Lg9/c0;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg9/c0;->a:Lg9/e0;

    iget-object v1, p0, Lg9/c0;->b:Ljava/lang/String;

    iget-object v2, p0, Lg9/c0;->c:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lg9/e0;->h(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
