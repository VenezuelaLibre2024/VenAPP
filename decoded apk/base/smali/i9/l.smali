.class public Li9/l;
.super Li9/d;
.source "SourceFile"


# instance fields
.field private final j:Lx8/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Lx8/i;Ljava/lang/String;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p11

    invoke-direct/range {v0 .. v10}, Li9/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p10

    iput-object v1, v0, Li9/l;->j:Lx8/i;

    return-void
.end method


# virtual methods
.method public f()Lx8/i;
    .locals 1

    iget-object v0, p0, Li9/l;->j:Lx8/i;

    return-object v0
.end method
