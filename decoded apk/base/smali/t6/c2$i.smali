.class public final Lt6/c2$i;
.super Lt6/c2$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lt6/c2$f;Lt6/c2$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/w;Ljava/lang/Object;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lt6/c2$f;",
            "Lt6/c2$b;",
            "Ljava/util/List<",
            "Lu7/c;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/common/collect/w<",
            "Lt6/c2$l;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lt6/c2$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lt6/c2$f;Lt6/c2$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/w;Ljava/lang/Object;Lt6/c2$a;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lt6/c2$f;Lt6/c2$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/w;Ljava/lang/Object;Lt6/c2$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lt6/c2$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Lt6/c2$f;Lt6/c2$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/w;Ljava/lang/Object;)V

    return-void
.end method
